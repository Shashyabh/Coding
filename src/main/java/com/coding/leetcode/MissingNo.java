package com.coding.leetcode;

public class MissingNo {
    public static void main(String[] args) {

        int []arr={0,1,5,2,4};
        int i=0;
        while(i< arr.length){
            int correct=arr[i];
            if(arr[i] !=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
