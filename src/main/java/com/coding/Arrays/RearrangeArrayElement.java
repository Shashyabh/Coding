package com.coding.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RearrangeArrayElement {
    public static void main(String[] args) {
        int []nums = {3,1,-2,-5,2,-4};//3,-2,1,-5,2,-4
        int i=0;
        int j=1;
        while(i< nums.length && j< nums.length){
            if(Integer.signum(nums[i])!=Integer.signum(nums[j])){
                i++;
                j++;
            }
            else{
                i++;
                j++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
