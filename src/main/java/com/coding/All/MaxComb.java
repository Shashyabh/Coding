package com.coding.All;

import java.util.ArrayList;

public class MaxComb {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,4,7,8};
        combin(arr);
    }

    private static void combin(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                list.add(i,j);
            }
        }
        System.out.println(list);
    }
}
