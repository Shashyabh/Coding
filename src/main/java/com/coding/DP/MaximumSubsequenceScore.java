package com.coding.DP;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubsequenceScore {
    public static void main(String[] args) {
       int[] nums1 = {1,3,3,2};
       int[]nums2 = {2,1,3,4};
       int k = 3;
        System.out.println(maxScore(nums1,nums2,k));
    }
    public static long maxScore(int[] nums1, int[] nums2, int k) {
        return helper(0, 0, Integer.MAX_VALUE, k,nums1,nums2);
    }

    private static int helper(int i, int sum, int min, int k,int nums1[],int nums2[]) {
        if (k == 0)
            return sum * min;

        if (i >= nums1.length)
            return 0;

        int picked = helper(i + 1, sum + nums1[i], Math.min(min, nums2[i]), k - 1,nums1,nums2);
        int notPicked = helper(i + 1, sum, min, k,nums1,nums2);

        return Math.max(picked, notPicked);
    }
//    public static long maxScore(int[] nums1, int[] nums2, int k) {
//        int max[]=new int[1];
//        max[0]=0;
//        f(nums1,nums2,k,0,0,max,new ArrayList<>(),new ArrayList<>());
//        return (long)max[0];
//    }
//
//    public static void f(int[]nums1, int[]nums2, int k, int i, int j, int max[], List<Integer> temp1, List<Integer>temp2){
//        if(i>=nums1.length && j>= nums2.length){
//            return;
//        }
//        if(temp1.size()==k && temp2.size()==k){
//            int total=0;
//            int min=Integer.MAX_VALUE;
//            for(int x:temp1){
//                total+=x;
//            }
//            for(int y:temp2){
//                min=Math.min(min,y);
//            }
//            max[0]=Math.max(max[0],total*min);
//            return;
//
//        }
//
//        f(nums1,nums2,k,i+1,j+1,max,temp1,temp2);
//        temp1.add(nums1[i]);
//        temp2.add(nums2[j]);
//        f(nums1,nums2,k,i+1,j+1,max,temp1,temp2);
//        temp1.remove(temp1.size()-1);
//        temp2.remove(temp2.size()-1);
//    }
}
