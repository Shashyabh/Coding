package com.coding.BinarySearch;

public class Upper_Bound {
    public static void main(String[] args) {
        System.out.println(upperBound(new int[]{1,2,3,4,4,5,5,5,5,8},10,5));
    }
    public static int upperBound(int []arr, int n, int x) {
        /////////// Write your code here
        int s=0;
        int e=n-1;
        int ans=n;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]<=x){
                ans=mid;
                s=mid+1;

            }
            else{
                e=mid-1;

            }
        }
        return ans;
    }
}
