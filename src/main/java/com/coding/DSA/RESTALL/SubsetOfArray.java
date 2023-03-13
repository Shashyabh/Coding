package com.coding.DSA.RESTALL;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SubsetOfArray {
    public static void main(String[] args) {

        HashSet<List<Integer>>set =new HashSet<>();
        int[] arr={1,2,3,5,5,4,6,7,8,9,10};
        List<List<Integer>> answer=subset(arr);
        for(List<Integer> ans:answer){
           int ab= ans.stream().reduce(0,(sum,i)->(sum+i));
           if(ab==10){
               if(!set.contains(ans)){
                   set.add(ans);
                   System.out.println(ans);
               }
           }
        }
    }

    private static List<List<Integer>> subset(int[] arr){
        List<List<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n= outer.size();  //[[]]=>1=>[[],[1]]=>2=>[[],[1],[2],[12]]=>[[],[1],[2],[3],[1,3],[2,3],[1,2,3]]
            for(int i=0;i<n;i++){
                List<Integer>inner=new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
