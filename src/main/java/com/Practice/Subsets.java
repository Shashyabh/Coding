package com.Practice;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int nums[]={2,4,5};
        List<Integer> ans=new ArrayList<>();
        f(nums,ans,0,0);
        System.out.println(ans);
    }

    public  static  void f(int [] nums, List<Integer> ans,int i,int total){
        if(i== nums.length){
            ans.add(total);
            return;
        }
        f(nums,ans,i+1,total+nums[i]);
        f(nums,ans,i+1,total);
    }
}
