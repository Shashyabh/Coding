package com.coding.DSA.RESTALL;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 11, 23, 35, 47, 51, 78, 98, 99, 134, 167};

        int ans=binarySearch(arr,66);
        System.out.println(ans);
    }

    private static int binarySearch(int[] arr, int i) {
        int start=0;
        int end=arr.length-1;
        int target=i;
        while(start<=end){
            int mid=(start+end)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                int ans=arr[mid];
                return ans;
            }
        }
        return -1;
    }
}
