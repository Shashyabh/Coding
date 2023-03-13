package com.coding.DSA.RESTALL;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumByIteration {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,5,2,7};
        List<List<Integer>> ans=iteration(arr);
        for(List<Integer> a:ans){
            int total=a.stream().reduce(0,(sum,i)->(sum+i));
            if(total==10){
                System.out.println(a);
            }
        }
    }
    static List<List<Integer>> iteration(int [] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num:arr){
            int n= outer.size();
            for(int i=0;i<n;i++){
                List<Integer> inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }

        return outer;
    }
}
