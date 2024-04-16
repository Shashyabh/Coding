package com.Practice;

public class MaxSumArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 3, -5, 2, 1,5, -5, 4};
        int maxSum = fun(nums);
        System.out.println("Maximum subarray sum: " + maxSum);
    }

    public static int fun(int arr[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }

    public static int f(int arr[]){
        int maxNow=arr[0];
        int maxSoFar=arr[0];
        int max=Integer.MIN_VALUE;
        for (int i = 1; i <arr.length ; i++) {
            maxNow=Math.max(arr[i],arr[i]+maxNow);
            maxSoFar=Math.max(maxNow,maxSoFar);
        }

        return maxSoFar;
    }
}
