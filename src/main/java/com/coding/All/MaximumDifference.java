package com.coding.All;

import java.util.HashMap;
import java.util.HashSet;

public class MaximumDifference {
    public static void main(String[] args) {
        int arr[]={3,45,15,5,90,175,11,10};
        differenceMax(arr);
    }

    private static void differenceMax(int[] arr) {
        int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            int x=arr[i];
            Integer value=map.get(x);



            //Brute Force O(n2)
//            for(int j=i+1;j< arr.length;j++){
//                int abs=Math.abs(arr[i]-arr[j]);
//                if(abs>max){
//                    max=abs;
//                }
//            }
        }
        System.out.println(max);
    }
}
