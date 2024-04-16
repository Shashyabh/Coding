package com.coding.Arrays;

public class EqulibriumArray {
    public static void main(String[] args) {
        int[] nums={-7, 6, 5, 10, -4, 8, 0};
        System.out.println(fun(nums));

    }

    public static int fun(int[] arr){

        int n=arr.length;
        int left=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }

        for(int i=0;i<n;i++){

            sum-=arr[i];
            if (sum==left) return left;
            left+=arr[i];
        }

//        for(int i=0;i<n;i++){
//
//            left+=arr[i];
//            if((left*2)==sum-arr[i+1]){
//                return left;
//            }
//        }
        return 0;
    }

//    public static int f(int arr[]){
//
//        int n=arr.length;
//        int left=0;
//        int right=0;
//        for(int i=0;i<n;i++){
//            left=0;
//            for (int j = 0; j < i; j++) {
//                left+=arr[j];
//            }
//
//            right=0;
//            for (int j = i+1; j <n ; j++) {
//                right+=arr[j];
//            }
//
//            if(left==right){
//                return left;
//            }
//
//        }
//
//        return left;
//    }
}
