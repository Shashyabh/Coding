package com.OraclePrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int [] arr=new int[]{2,4,1,5,7,9};
        int ans[]=f(arr,15);
        for (int a:ans){
            System.out.println(a);
        }
    }

    public static int[] f(int[]arr,int sum){
        Arrays.sort(arr);
        int n=arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0;i<n;i++){
            if(i!=0 && arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=n-1;

            while (j<k){
                int total=arr[i]+arr[j]+arr[k];
                if(total<sum){
                    j++;
                }
                else if(total>sum){
                    k--;
                }
                else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }
        System.out.println(ans);
        return new int[]{};


//        int[] ans=new int[3];
//        List<List<Integer>>list=new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            HashSet<Integer> set=new HashSet<>();
//            for (int j = i+1; j < arr.length; j++) {
//                int restSum=sum-arr[i]-arr[j];
//                if(set.contains(restSum)){
//                    ans[0]=arr[i];
//                    ans[1]=arr[j];
//                    ans[2]=restSum;
//                    list.add(Arrays.asList(arr[i],arr[j],restSum));
//                }
//                else {
//                    set.add(arr[j]);
//                }
//            }
//        }
//
//        System.out.println(list);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                for (int k = j+1; k < arr.length; k++) {
//                    if(arr[i]+arr[j]+arr[k]==sum){
//                        ans[0]=arr[i];
//                        ans[1]=arr[j];
//                        ans[2]=arr[k];
//                    }
//                }
//            }
//        }

        //return ans;
    }
}
