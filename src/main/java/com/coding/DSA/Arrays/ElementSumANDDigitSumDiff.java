package com.coding.DSA.Arrays;

public class ElementSumANDDigitSumDiff {
    public static void main(String[] args) {
        int [] nums = {1,15,6,3};
        digitSumDiff(nums);
    }

    private static void digitSumDiff(int[] nums) {
        int digitSum=0;
        int totalSum=0;
        int rem=0;
        for (int i = 0; i < nums.length; i++) {
            totalSum=totalSum+nums[i];
            while (nums[i]>0){
                rem=nums[i]%10;
                digitSum=digitSum+rem;
                nums[i]=nums[i]/10;
            }
        }
        int diff=Math.abs(totalSum-digitSum);
        System.out.println(diff);
    }
}
