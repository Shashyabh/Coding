package com.coding.DSA.RESTALL;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int []arr={-1,0,1,2,-1,-4};
        ArrayList<List<Integer>>result=threeSum(new ArrayList<>(), arr, 0, new ArrayList<List<Integer>>());
       // System.out.println(result);
//        for(List<Integer> a:result){
//            System.out.println(a.toString());
//        }
    }
    static ArrayList<List<Integer>> threeSum(List<Integer>temp,int[] arr,int k,ArrayList<List<Integer>> res){

        if(k== arr.length){
            res.add(new ArrayList<>(temp));
            for(List<Integer> a:res){
                int ch=a.stream().reduce(0,(sum,i)->sum+i);
                if(ch==0&&a.size()==3){
                    System.out.println(a);
                }
            }
            return res;
        }
        //List<List<Integer>> res=new ArrayList<>();

        temp.add(arr[k]);
        threeSum(temp,arr,k+1,res);
        temp.remove(temp.size()-1);
        threeSum(temp,arr,k+1,res);

        return res;
    }
}
