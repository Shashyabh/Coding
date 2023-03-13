package com.coding.DSA.RESTALL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CombinationSumByRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,10};
       //combinationSum("",arr,10);
        ArrayList<String> ans=combinationArrayList("",arr,10);
       // System.out.println(ans);
        for(String s:ans){
            System.out.println(s);
        }

    }

    static void combinationSum(String p,int []arr, int target){
        if(target==0){
            System.out.println(p+" ");
            return;
        }

        for(int i=1;i<=arr.length && i<=target; i++){
            combinationSum(i+" "+p,Arrays.copyOfRange(arr,2,arr.length),target-i);
        }

    }

    static ArrayList<String> combinationArrayList(String p, int[] arr, int target){
        if(target==0){
            ArrayList<String>list =new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<=arr.length&&i<=target;i++){
            ans.addAll(combinationArrayList(i+p,Arrays.copyOfRange(arr,1,arr.length),target-i));
            //System.out.println(grp);
        }
        return ans;
    }

}
