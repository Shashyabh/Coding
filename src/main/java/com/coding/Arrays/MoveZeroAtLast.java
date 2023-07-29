package com.coding.Arrays;

import java.util.Arrays;

public class MoveZeroAtLast {
    public static void main(String[] args) {
        int [] nums={0,1,0,3,12};
        int arr[]=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[k]=nums[i];
                k++;
            }
        }
        for(int i=k;i<nums.length;i++){
            arr[i]=0;
        }
//         for(int i=0;i<nums.length;i++){
//             nums[i]=arr[i]
//         }
        System.out.println(Arrays.toString(arr));
    }
}
