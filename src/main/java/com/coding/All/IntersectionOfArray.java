package com.coding.All;

import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionOfArray {

    public static void printIntersection(int[] arr1,int[] arr2){
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }

        for(int i:arr2){
            if(set.contains(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
          int arr1[]={4,5,1,7,8,2};
          int arr2[]={9,11,8,3,1,13};
//
//        ArrayList<Integer> arr=new ArrayList<>();
//        for(int i=0;i<arr1.length;i++){
//            for(int j=0;j<arr2.length;j++){
//                if(arr1[i]==arr2[j]){
//                    arr.add(arr2[j]);
//                }
//            }
//            int j=0;
//        }
//        for(Integer a:arr){
//            System.out.println(a);
//        }

        printIntersection(arr1,arr2);
    }
}
