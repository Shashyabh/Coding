package com.coding.All;

import java.util.HashSet;

public class NextGreaterNumber {
    public static void main(String[] args) {
        int arr[]={3,8,2,6,7,1};
        heightest(arr);
    }

    private static void heightest(int[] arr) {

        int currHeightest=0;
        int next;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            next=0;
            for(int j=i+1;j< arr.length;j++){

                if(arr[i]<arr[j]){

                    next=arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " -- " + next);
        }
    }
}
