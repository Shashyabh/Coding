package com.coding.Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthPermutation {
    public static void main(String[] args) {
        System.out.println(combinationSum3(4,3));
    }
    public static String combinationSum3(int k, int n) {

        List<List<Integer>> ans=new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        boolean[] vis=new boolean[n+1];
        f(ans,k,n,1,new ArrayList<>(),vis);
        List<Integer>a=ans.get(k-1);
        for (int x:a){
            sb.append(x);
        }
        return sb.toString();
    }

    public static void f(List<List<Integer>> ans,int k ,int n ,int ind, List<Integer>temp,boolean []vis){
        if(temp.size()==n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=1;i<=n;i++){
            if(!vis[i]){
                vis[i]=true;
                temp.add(i);
                f(ans,k,n,i+1,temp,vis);
                vis[i]=false;
                temp.remove(temp.size()-1);
            }
        }
    }
}
