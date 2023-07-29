package com.coding.Arrays;

public class SingleNumbe {
    public static void main(String[] args) {
        int [] arr={4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {

        int ans = 0;

        for(int num:nums){
            ans ^= num;
        }

        return ans;
    }
}
