package com.coding.DSA.RESTALL;

import java.util.Arrays;

public class MerseeSORT {

    public static int[] merseSort(int [] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int left[]=merseSort(Arrays.copyOfRange(arr,0,mid));
        int right[]=merseSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merse(left,right);
    }

    public static int [] merse(int [] left,int[]right){
        int[] mix=new int[left.length+right.length];
        int i=0,j=0,k=0;
        while (i<left.length&&j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;k++;
            }
            else {
                mix[k]=right[j];
                j++;
                k++;
            }
        }
        while (i<left.length){
            mix[k]=left[i];
            i++;k++;
        }
        while (j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }

    public static void main(String[] args) {
        int[] arr={3,1,4,7,2,5};
        int[] ans=merseSort(arr);
        System.out.println((Arrays.toString(ans)));
    }
}
