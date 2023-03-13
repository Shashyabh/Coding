package com.coding.DSA.RESTALL;

import java.util.Arrays;

public class MerseSort {
    public static void main(String[] args) {
        int [] arr={2,5,8,5,3,9,1};
        int s=0;
        int e= arr.length;
        merseSort(arr,s,e);
        System.out.println(Arrays.toString(arr));
    }

    private static void merseSort(int[] arr,int s,int e) {
        if(e-s==1){
            return;
        }
        int mid=s+(e-s)/2;
        merseSort(arr,s,mid);
        merseSort(arr,mid,e);
        merse(arr,s,mid,e);
    }

    private static void merse(int[] arr, int s, int mid, int e) {
        int [] mix=new int[e-s];
        int i=s;
        int j=mid;
        int k=0;

        while(i<mid && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
                k++;
            }
            else{
                mix[k]=arr[j];
                j++;k++;
            }
        }
        while(i<mid){
            mix[k]=arr[i];
            i++;k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
