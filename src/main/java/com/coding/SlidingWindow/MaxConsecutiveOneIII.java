package com.coding.SlidingWindow;

public class MaxConsecutiveOneIII {
    public static void main(String[] args) {
        int []nums={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(longestOnes(nums,k));
    }
    public static int longestOnes(int[] nums, int k) {
        int j=0;
        int max=Integer.MIN_VALUE;
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
            }

            while(count>k){
                if(nums[j]==0){
                    count--;
                }
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}
