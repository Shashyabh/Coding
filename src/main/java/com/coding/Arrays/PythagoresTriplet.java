package com.coding.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PythagoresTriplet {
    public static void main(String[] args) {
        int[] arr = {3, 5, 12, 7, 9, 13, 8, 15, 10};
        List<int[]> ans=new ArrayList<>();

        HashSet<Integer> set=new HashSet<>();
        int n=arr.length;

        for(int a:arr){
            set.add(a*a);
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int result=arr[i]*arr[i]+arr[j]*arr[j];
                if(set.contains(result)){
                    ans.add(new int[]{arr[i],arr[j],(int)Math.sqrt(result)});
                }
            }
        }
        System.out.println("Pythagorean Triplets:");
        for (int[] triplet : ans) {
            System.out.println(triplet[0] + ", " + triplet[1] + ", " + triplet[2]);
        }
    }

    public static List<int[]> f(int[] arr){

        List<int[]> ans=new ArrayList<>();
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    int a = arr[i] * arr[i];
                    int b = arr[j] * arr[j];
                    int c = arr[k] * arr[k];

                    if(a==b+c || b==a+c || c==a+b){
                        ans.add(new int[]{arr[i],arr[j],arr[k]});
                    }
                }
            }
        }
        return ans;
    }
}
