package com.coding.DSA.RESTALL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutaionOfSubarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,10};
        int target=10;
        allCombination(new ArrayList<>(),0,arr);
       // System.out.println(allCount(new ArrayList<>(),0,arr)-1);
//        if(result.size()==2){
//            int ch=result.stream().reduce(0,(sum,i)->sum+i);
//            if(ch==10){
//                System.out.println(result);
//            }
//        }
        System.out.println(allCount(new ArrayList<>(),0,arr));
    }
    private static void allCombination(List<Integer> temp,int index,int[]arr) {
        if(index==arr.length){
           // System.out.println(temp);
            int num=temp.stream().reduce(0,(sum,i)->sum+i);
            if(num==10){
                System.out.println(temp);
            }
            return;
        }
        temp.add(arr[index]);
        allCombination(temp,index+1,arr);
        temp.remove(temp.size()-1);
        allCombination(temp,index+1,arr);
    }

    private static int allCount(List<Integer> temp,int index,int[]arr){
        if(index== arr.length){
            int num=temp.stream().reduce(0,(sum,i)->sum+i);
            if(num==10){
                return 1;
            }
            return 0;

        }
        int count=0;
        temp.add(arr[index]);
        count=count+allCount(temp,index+1,arr);
        temp.remove(temp.size()-1);
        count=count+allCount(temp,index+1,arr);
        return count;
    }
}