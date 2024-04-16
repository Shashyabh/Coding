package com.coding.Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSumII {
    public static void main(String[] args) {
        System.out.println(subsetSum(new int[]{1,2}));
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> ans=new ArrayList<>();
        f(0,0,num,ans);
        Collections.sort(ans);
        return ans;
    }

    public static void f(int i,int sum,int []nums,ArrayList<Integer> ans){
        if(i==nums.length){
            ans.add(sum);
            return;
        }
        f(i+1,sum+nums[i],nums,ans);
        f(i+1,sum,nums,ans);
    }
}
