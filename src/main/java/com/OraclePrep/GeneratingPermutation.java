package com.OraclePrep;

import java.util.ArrayList;
import java.util.List;

public class GeneratingPermutation {
    public static void main(String[] args) {
        int num[]={1,2,3};
        List<List<Integer>>ans=new ArrayList<>();
        f(num,new ArrayList<>(),ans);
        System.out.println(ans);
    }

    public static void f(int num[],  List<Integer>temp,List<List<Integer>>ans){
        if(temp.size()== num.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < num.length; i++) {
            if(temp.contains(num[i]))continue;
            else {
                temp.add(num[i]);
                f(num,temp, ans);
                temp.remove(temp.size()-1);
            }
        }
    }
}
