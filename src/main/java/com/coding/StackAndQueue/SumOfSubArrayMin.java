package com.coding.StackAndQueue;

import java.util.ArrayList;
import java.util.List;

public class SumOfSubArrayMin {
    public static void main(String[] args) {
        int []arr = {3,1,2,4};
        List<List<Integer>>list=new ArrayList<>();
        f(arr,list,0,new ArrayList<>());
        for(List<Integer> ans:list){
            System.out.println(ans);
        }

    }
    public static void f(int []arr,List<List<Integer>>list,int i,List<Integer>temp){
        if(i==arr.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        int x=arr[i];
        temp.add(x);
        f(arr,list,i+1,temp);
        temp.remove(temp.size()-1);
        f(arr,list,i+1,temp);
    }
}
