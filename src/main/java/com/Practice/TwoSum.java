package com.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 10, 7, 1, 4, 3, 11, 5};
        List<int[]> ints = doSum(arr, 8);
        for (int[] pair : ints) {
            System.out.println(pair[0] + ", " + pair[1]);
        }
    }
    public static List<int[]> doSum(int arr[], int target) {
        int[] arr1;
        List<int[]> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int restSum = target - arr[i];
            if(map.containsKey(restSum)){
                arr1 = new int[2];
                arr1[0]=map.get(restSum);
                arr1[1]=i;
                list.add(arr1);
            }else{
                map.put(arr[i],i);
            }
        }
        return list;
    }
}
