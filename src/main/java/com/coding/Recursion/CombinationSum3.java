package com.coding.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    public static void main(String[] args) {
//        Input: k = 3, n = 7
//        Output: [[1,2,4]]
        System.out.println(combinationSum3(3,7));
    }
    public  static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        f(ans,k,n,1,new ArrayList<>());
        return ans;
    }

    public static void f(List<List<Integer>> ans,int k ,int n ,int ind, List<Integer>temp){
        //System.out.println(temp);
        if(temp.size()==k && n==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<=6;i++){
            temp.add(i);
            f(ans,k,n-i,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}
