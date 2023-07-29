package com.coding.Tree;

import java.util.*;

public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    public static Node createTree(Node root){
        System.out.print("Enter the data: ");
        int data;
        Scanner sc=new Scanner(System.in);
        data=sc.nextInt();
        root=new Node(data);

        if(data==-1){
            return null;
        }
        System.out.println("Enter the left data : "+data);
        root.left=createTree(root.left);

        System.out.println("Enter the right data : "+data);
        root.right=createTree(root.right);
        return root;
    }

    public static void levelOrder(Node root){
        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()){
            Node temp= queue.peek();
            queue.remove();

            if(temp==null){
                System.out.println();
                if(!queue.isEmpty()){
                    queue.add(null);
                }
            }

            else {
                System.out.print(temp.data+" ");
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
        }
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }


    public static Node buildFromLevelOrder(Node root){

        Queue<Node>queue=new LinkedList<>();

        System.out.println("Enter data of tree : ");
        int data;
        Scanner sc=new Scanner(System.in);
        data=sc.nextInt();
        root=new Node(data);
        queue.add(root);

        while (!queue.isEmpty()){
            Node temp=queue.peek();
            queue.remove();
            System.out.println("Enter left node for :  "+ temp.data);
            int leftData;
            leftData=sc.nextInt();
            if(leftData!=-1){
                temp.left=new Node(leftData);
                queue.add(temp.left);
            }


            System.out.println("Enter right node for :  "+ temp.data);
            int rightData;
            rightData=sc.nextInt();
            if(rightData!=-1){
                temp.right=new Node(rightData);
                queue.add(temp.right);
            }
        }
        return root;
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);

        int ans=Math.max(left,right)+1;
        return ans;
    }

//    public static HashMap<Integer,Integer> heightOptimize(Node root){
//        if(root==null){
//            HashMap<Integer,Integer> h=new HashMap<>();
//            h.put(0,0);
//            return h;
//        }
//
//        Pair<Integer,Integer>p=new Pair<>();
//        HashMap<Integer,Integer> left=new HashMap<>((Map) root.left);
//        HashMap<Integer,Integer> right=new HashMap<>((Map) root.right);
//
//    }
    static int ans = Integer.MIN_VALUE;
    private static int dfs(Node root, boolean isLeft) {
        if (root == null)
            return -1;

        int leftval=root.data;
        int left = dfs(root.left, true) + 1;
        int right = dfs(root.right, false) + 1;

        ans = Math.max(ans, Math.max(left, right));

        if (isLeft) {
            return right;
        } else {
            return left;
        }
    }

    public static int longestZigZag(Node root) {
        if (root == null)
            return 0;

        int left = dfs(root.left, true);
        int right = dfs(root.right, false);
        ans = Math.max(ans, Math.max(left, right) + 1);
        return ans;
    }

    public static void main(String[] args) {
        //1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1
        Node root=null;
//        root=createTree(root);

        root=buildFromLevelOrder(root);
//        System.out.println();
//        levelOrder(root);
//
//        System.out.println();
//        int heigt=height(root);
//        System.out.println("Height of tree is : "+heigt);
        System.out.println(" Max Zigzag traversal of tree " + longestZigZag(root));

//        System.out.println("InOrder ");
//        inorder(root);
//
//        System.out.println();
//        System.out.println("PreOrder ");
//        preOrder(root);
//
//        System.out.println();
//        System.out.println("PostOrder ");
//        postOrder(root);
    }
}
