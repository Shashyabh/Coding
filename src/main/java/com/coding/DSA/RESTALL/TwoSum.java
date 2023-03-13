package com.coding.DSA.RESTALL;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,3,4,5};
        int target=7;
        allCombination(new ArrayList<>(),arr,target,0);
    }
    private static void allCombination(List<Integer> temp, int[]arr, int target,int k) {
        if(k<= arr.length|| target==0){
            System.out.println(temp);
            return;
        }
        temp.add(arr[k]);
        allCombination(temp,arr,target-arr[k],k+1);
//        temp.remove(temp.size()-1);
//        allCombination(temp,arr,target-arr[k],k+1);
    }
}
