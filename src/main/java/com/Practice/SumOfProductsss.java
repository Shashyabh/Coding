package com.Practice;

public class SumOfProductsss {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = sumOfProductsExceptSelf(nums);

        System.out.print("Sum of products except self: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] sumOfProductsExceptSelf(int[] nums) {
        int n = nums.length;

        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }

    public static int[]  f(int[]arr){
        int n=arr.length;
        int left[]=new int [n];
        int right[]=new int[n];
        int result[]=new int [n];

        left[0]=1;
        for (int i = 1; i < n; i++) {
            left[i]=left[i-1]*arr[i-1];
        }

        right[n-1]=1;
        for (int i = n-2; i >=0; i--) {
            right[i]=right[i+1]*arr[i+1];
        }

        for (int i=0;i<n;i++){
            result[i]=left[i]*right[i];
        }
        return result;
    }
}
