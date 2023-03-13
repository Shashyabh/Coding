package com.coding.All;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] arr={1,2,5,3,3};
        findDuplicates(arr);
    }
    public static void findDuplicates(int[] nums) {

        int count = 0, lessthan = 0;int target=3;
        for (int n : nums) {
            if (n == target) count++;
            if (n < target) lessthan++;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(lessthan++);
        }
        System.out.println(result);
    }
}
