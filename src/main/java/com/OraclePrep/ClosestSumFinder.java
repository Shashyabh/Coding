package com.OraclePrep;

import java.util.Arrays;

public class ClosestSumFinder {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 7, 10, 13};
        int target = 16;

        int[] closestSumPair = findClosestSumPair(nums, target);

        System.out.println("Closest sum pair to target " + target + ": " +
                closestSumPair[0] + " and " + closestSumPair[1]);
    }

    public static int[] findClosestSumPair(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array in ascending order
        int left = 0;
        int right = nums.length - 1;
        int closestSum = Integer.MAX_VALUE;
        int[] result = new int[2];

        while (left < right) {
            int currentSum = nums[left] + nums[right];
            int currentDiff = Math.abs(currentSum - target);

            if (currentDiff < closestSum) {
                closestSum = currentDiff;
                result[0] = nums[left];
                result[1] = nums[right];
            }

            if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
