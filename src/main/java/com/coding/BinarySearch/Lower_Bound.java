package com.coding.BinarySearch;

public class Lower_Bound {
    public static void main(String[] args) {
        System.out.println(lowerBound(new int[]{1,2,4,5,5,5,5,8},7,5));
    }
    public static int lowerBound(int []arr, int n, int x) {
        /////////// Write your code here
        int s=0;
        int e=n-1;
        int ans=n;

        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]>=x){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}
