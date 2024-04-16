package com.coding.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BT {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){};
        TreeNode (int val){
            this.val=val;
        }
    }
    static class Pair{
        TreeNode node;
        int num;
        Pair (TreeNode node,int num){
            this.node=node;
            this.num=num;
        }
    }
    public static int sumNumbers(TreeNode root) {
        System.out.println(f(root,0));
        return 0;
    }
    public static int f(TreeNode root,int sum){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return sum*10+root.val;
        }
        int left=f(root.left,sum*10+root.val);
        int right=f(root.right,sum*10+root.val);
        return left+right;
    }

    public static void allTraversal(TreeNode node, List<Integer>pre,List<Integer>in ,List<Integer>post){
        Stack<Pair> st=new Stack<>();
        st.push(new Pair(node,1));

        while(!st.isEmpty()){
            Pair pr=st.pop();
            if(pr.num==1){
                pre.add(pr.node.val);
                pr.num++;
                st.push(pr);
                if(pr.node.left!=null){
                    st.push(new Pair(pr.node.left, 1));
                }
            }
            else if(pr.num==2){
                in.add(pr.node.val);
                pr.num++;
                st.push(pr);
                if(pr.node.right!=null){
                    st.push(new Pair(pr.node.right, 1));
                }
            }
            else {
                post.add(pr.node.val);
            }
        }

    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root==p || root==q){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);

        if(left==null){
            return right;
        }
        else if(right==null){
            return left;
        }
        else{
            return root;
        }
    }
    //          1
    //        2   3
    //      4  5 6  7
    //     8

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.left.left=new TreeNode(8);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(lowestCommonAncestor(root,root.left.left.left,root.left.right).val);
//        List < Integer > pre = new ArrayList<>();
//        List < Integer > in = new ArrayList <> ();
//        List < Integer > post = new ArrayList <> ();


        //allTraversal(root, pre, in , post);
//        sumNumbers(root);
//        System.out.println("The preorder Traversal is : ");
//        for (int nodeVal: pre) {
//            System.out.print(nodeVal + " ");
//        }
//        System.out.println();
//        System.out.println("The inorder Traversal is : ");
//        for (int nodeVal: in ) {
//            System.out.print(nodeVal + " ");
//        }
//        System.out.println();
//        System.out.println("The postorder Traversal is : ");
//        for (int nodeVal: post) {
//            System.out.print(nodeVal + " ");
//        }
        System.out.println();

    }
}
