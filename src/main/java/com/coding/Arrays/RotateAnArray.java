package com.coding.Arrays;

import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int x=3;
        int n=nums.length;
        if(n==0){
            return;
        }
        x=x%n;
        reverse(nums,0,n-x-1);
        System.out.println(Arrays.toString(nums));
        reverse(nums,n-x,n-1);
        System.out.println(Arrays.toString(nums));
        reverse(nums,0,n-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void reverse(int[]arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
