package com.Practice;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class ClosestSmallerNumberInTree {
    private static int closestSmaller = Integer.MIN_VALUE;

    public static int findClosestSmaller(TreeNode root, int target) {
        closestSmaller = Integer.MIN_VALUE;
        findClosest(root, target);
        return closestSmaller;
    }
    //          4
    //      2       6
    //    1   3   5   7
    //
    private static void findClosest(TreeNode node, int target) {
        if (node == null) {
            return;
        }

        if (node.val < target) {
            closestSmaller = Math.max(closestSmaller, node.val);
        }

        if (node.val >= target) {
            findClosest(node.left, target);
        } else {
            findClosest(node.right, target);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        int target = 4;
        int closest = findClosestSmaller(root, target);
        System.out.println("Closest smaller number: " + closest);
    }
}

