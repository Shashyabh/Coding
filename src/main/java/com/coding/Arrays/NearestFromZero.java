package com.coding.Arrays;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class NearestFromZero {
    public static void main(String[] args) {
        int [] nums={-1,-1};//{2,1,1,-1,100000};//
        nearest(nums);
    }

    private static void nearest(int[] nums) {
        int currMin=0;
        int overMin=Integer.MAX_VALUE;
        int ans=0;
        for (int i = 0; i < nums.length; i++) {
            currMin=Math.abs(nums[i])-0;
            if(overMin>=currMin){
                if(nums[i]<0){
                    overMin=currMin;
                    ans=Math.abs(nums[i]);
                    ans=Math.max(ans,nums[i]);
                }
                else {
                    overMin=currMin;
                    ans=nums[i]<0?nums[i]:Math.abs(nums[i]);
                    ans=Math.max(ans,nums[i]);
                }
            }
        }
        System.out.println(ans);


//        int min = Integer.MAX_VALUE;
//        int ans = Integer.MIN_VALUE;
//
//        for (int n : nums) {
//            if (Math.abs(n) < min) {
//                min = Math.abs(n);
//                ans = n;
//            } else if (Math.abs(n) == min) {
//                ans = Math.max(ans, n);
//            }
//        }
//        System.out.println(ans);
    }
}
