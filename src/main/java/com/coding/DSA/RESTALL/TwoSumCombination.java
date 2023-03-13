package com.coding.DSA.RESTALL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumCombination {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,5,3,2};
        int target=6;
        System.out.println(twoSum(arr,target));

    }
    public static boolean twoSum(int[] nums, int target) {
        // base case
        if (nums.length == 0) {
            return false;
        }
        // recursive case
        int lastNum = nums[nums.length - 1];
        int[] subArray = Arrays.copyOfRange(nums, 0, nums.length - 1);
        return twoSum(subArray, target - lastNum) || twoSum(subArray, target);
    }
}
