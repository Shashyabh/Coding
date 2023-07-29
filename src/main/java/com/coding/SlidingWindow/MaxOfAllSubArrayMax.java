package com.coding.SlidingWindow;

import java.util.Arrays;

public class MaxOfAllSubArrayMax {
    public static void main(String[] args) {
        int[]nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        int[]ans=maxSlidingWindow(nums,k);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int i=0;
        int j=0;
        int []ans=new int[nums.length-k+1];
        int max=Integer.MIN_VALUE;
        int x=0;
        while(j<nums.length){
            max=Math.max(max,nums[j]);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                ans[x]=max;
                x++;
                i++;
                j++;
                if(i<nums.length){
                    max=nums[i];
                }
            }
        }
        return ans;
    }
}
