package com.coding.Arrays;

import java.util.Arrays;

public class MoveZeroAtStart {
    public static void main(String[] args) {
        int nums[]={0,2,3,0,0,1,0,4,0,8,7,0};

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
        System.out.println(Arrays.toString(nums));
    }
}
