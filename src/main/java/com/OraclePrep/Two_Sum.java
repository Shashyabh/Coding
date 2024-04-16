package com.OraclePrep;

import java.util.HashMap;
import java.util.HashSet;

public class Two_Sum {
    public static void main(String[] args) {
        int [] arr=new int[]{2,4,1,5,7,9};
        int ans[]=f(arr,13);
//        int opp=1234;
//        System.out.println(Integer.reverse(opp));
        for(int a:ans){
            System.out.println(a);
        }
    }

    public static int[] f(int []arr,int k){
        int ans[]=new int[2];
//        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> map=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int restSum=k-arr[i];
            if(map.contains(restSum)){
                ans[0]=arr[i];
                ans[1]=restSum;
            }
            else {
                map.add(arr[i]);
            }
        }
//        int ans[]=new int[2];
//        for (int i = 0; i < arr.length; i++) {
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]+arr[j]==k){
//                    ans[0]=arr[i];
//                    ans[1]=arr[j];
//                }
//            }
//        }
        return ans;
    }
}
