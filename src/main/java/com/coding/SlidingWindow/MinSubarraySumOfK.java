package com.coding.SlidingWindow;

public class MinSubarraySumOfK {
    public static void main(String[] args) {
        System.out.println(minSubarraySum(new int[]{10,4,2,5,6,3,8,1}, 8,3));
    }
    public static int minSubarraySum(int []arr, int n, int k)
    {
        // Write your code here.
        int i=0;
        int j=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        //10,4,2,5,6,3,8,1
        while(j<=n-1){
            sum=sum+arr[j];
            if(j-i+1==k){
                min=Math.min(min, sum);
                j++;
            }
            if(j-i+1>k){
                while(j-i+1>k){
                    sum=sum-arr[i];
                    i++;
                }
            }
            else{
                j++;
            }
        }
        return min;
    }
}

