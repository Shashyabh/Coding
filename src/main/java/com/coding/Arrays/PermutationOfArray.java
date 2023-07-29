package com.coding.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>>result =new ArrayList<>();
        permutaion(result,new ArrayList<>(),nums);
        for(List<Integer>s:result){
            System.out.println(s);
        }
    }

    public static void permutaion(List<List<Integer>> list,List<Integer>temp,int []nums){
        if(temp.size()==nums.length){
            list.add(new ArrayList<>(temp));
        }

        for (int i = 0; i < nums.length ; i++) {
            if(temp.contains(nums[i])) continue;
            else {
                temp.add(nums[i]);
                permutaion(list,temp,nums);
                temp.remove(temp.size()-1);
            }
        }
    }
}