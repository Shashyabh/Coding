package com.coding.All;


import java.util.ArrayList;
import java.util.HashSet;

//[2,4,1,5,7,8,0]
//O/p- 3,6
public class MissingNo {
    public static void main(String[] args) {
        Integer arr[]={2,1,5,7,8,0};
        MisNum(arr);
    }

    public static void MisNum(Integer arr[]){

        HashSet<Integer> set=new HashSet<Integer>();
        for(int num:arr){
            set.add(num);
        }
        for(int i=0;i< arr.length+1;i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
    }


}