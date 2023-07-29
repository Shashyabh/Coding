package com.coding.SlidingWindow;

public class NoOfNiceSubArray {
    public static void main(String[] args) {
        int nums[]={2,3,5};
        int k=1;
        System.out.println(numberOfSubarrays(nums,k));
    }
    public static int numberOfSubarrays(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int oddCount = 0;
        int count = 0;
        int temp = 0;

        while (j < nums.length) {
            if (nums[j] % 2 == 1) {
                oddCount++;
                temp = 0;
            }
            while (oddCount == k) {
                temp++;
                if (nums[i] % 2 == 1) {
                    oddCount--;
                }
                i++;
            }
            count += temp;
            j++;
        }
        return count;
    }
}
