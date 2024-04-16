package com.coding.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllSubArray {
    public static void main(String[] args) {
        int nums[]={3,4,6,7};
        List<List<Integer>> ans=new ArrayList<>();
        f(0,0, nums.length, nums,new ArrayList<>(),ans);
        System.out.println(ans);
    }

    public static void f(int start,int end, int n, int[] nums, List<Integer> temp, List<List<Integer>> ans) {
        if (end == n) {

            return;
        } else if (start>end) {
            f(0,end+1,n,nums,temp,ans);
        }

        else {
//            List<Integer> subarray = new ArrayList<>();
            temp=new ArrayList<>();
            for (int i = start; i < end; i++) {
                temp.add(nums[i]);

            }
            ans.add(new ArrayList<>(temp));
            f(start+1,end,n,nums,temp,ans);
        }
    }
}
