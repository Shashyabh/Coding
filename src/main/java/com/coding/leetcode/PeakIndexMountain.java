package com.coding.leetcode;

public class PeakIndexMountain {
    public static void main(String[] args) {
        int[] arr={1,2,1,0};
        int ans=0;

        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else {
                start = mid + 1;
            }
            ans=start;
        }
        System.out.println(ans);
    }
}
