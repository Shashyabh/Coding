package com.coding.Arrays;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int nums[]={1,0,1,2,2,1,0,1};

        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                i++;
            }
            else{
                break;
            }
        }
        int i=0;
        int j=k;
        while (j< nums.length){
            if(nums[j]==0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;
        }

        int k1=0;
        for(int i1=0;i1<nums.length;i1++){
            if(nums[i1]==0){
                k1++;
            }
            else{
                break;
            }
        }
        int i1=k1;
        int j1=k1;
        while (j1< nums.length){
            if(nums[j1]==1){
                int temp=nums[i1];
                nums[i1]=nums[j1];
                nums[j1]=temp;
                i1++;
            }
            j1++;
        }


        System.out.println(Arrays.toString(nums));
    }
}
