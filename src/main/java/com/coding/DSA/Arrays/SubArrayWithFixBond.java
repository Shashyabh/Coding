package com.coding.DSA.Arrays;

import java.util.Arrays;

public class SubArrayWithFixBond {
    public static void main(String[] args) {
        int[]arr={8,1,2,2,3};//[1,2,2,3,8]
        Arrays.sort(arr);
        count(arr);
    }

    public static void count(int arr[]){
        int []ans =new int[arr.length];
        int k=0;
        for (int i = 0; i < arr.length ; i++) {
            if(i!= 0){
                if(arr[i]==arr[i-1]){
                    ans[k]=i-1;
                    k++;
                }
                else {
                    ans[k]=i;
                    k++;
                }
            }
            else {
                ans[k]=i;
                k++;
            }
        }

        System.out.println(Arrays.toString(ans));

//        int []ans =new int[arr.length];  //[4,0,1,1,3]
//        int k=0;
//        int count=0;
//        for (int i = 0; i < arr.length ; i++) {
//            count=0;
//            for (int j = 0; j < arr.length; j++) {
//                if(j!=i){
//                    if(arr[i]>arr[j]){
//                        count++;
//                    }
//                }
//            }
//            ans[k]=count;
//            k++;
//        }
//        System.out.println(Arrays.toString(ans));
    }
}
