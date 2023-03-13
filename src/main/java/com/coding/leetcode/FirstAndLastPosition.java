package com.coding.leetcode;

import java.util.HashSet;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr1={1,2,3,3,3,3,8,8,9};
        int[] val=serchRange(arr1,3);
        System.out.println(val[0]+" "+val[1]);

    }

    private static int[] serchRange(int[] nums, int target) {

        HashSet<Integer> set=new HashSet<>();

        int []arr={-1,-1};
        int [] arr2={0,0};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(!set.contains(nums[i])){
                    set.add(nums[i]);
                    arr[0]=i;
                }
                else {
                    arr[1]=i;
                }
            }
        }
        if(set.contains(target)){
            return arr;
        }
        else {
            return arr2;
        }

    }
}