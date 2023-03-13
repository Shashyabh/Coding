package com.coding.DSA.Arrays;

public class MiddleOfArray {
    public static void main(String[] args) {
        int[] nums={2,3,-1,8,4};
        System.out.println(findMiddleIndex(nums));
    }
    public static int findMiddleIndex(int[] nums) {
        int l=0;
        int r=0;
        for(int i=0;i<nums.length;i++){
            l=leftsum(nums,i);
            r=rightsum(nums,i);
            if(l==r){
                return i;
            }
        }
        return -1;
    }

    public static int leftsum(int[]nums,int left){
        int sum=0;
        for(int i=0;i<left;i++){
            sum=sum+nums[i];
        }
        return sum;
    }

    public static int rightsum(int[]nums,int right){
        int sum=0;
        for(int i=right+1;i<nums.length;i++){
            sum=sum+nums[i];
        }
        return sum;
    }
}
