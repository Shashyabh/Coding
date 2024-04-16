package com.Practice;

import java.util.ArrayList;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> result = f(nums, target);

        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
    }

    public static List<List<Integer>> f(int arr[],int target){
        List<List<Integer>> ans = new ArrayList<>();
        int n=arr.length;

        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                for(int k=i+2;k<n-1;k++){
                    for(int l=i+3;l<n;l++){
                        if(arr[i]+arr[j]+arr[k]+arr[l]==target){
                            List<Integer> quad = new ArrayList<>();
                            quad.add(arr[i]);
                            quad.add(arr[j]);
                            quad.add(arr[k]);
                            quad.add(arr[l]);
                            ans.add(quad);
                        }
                    }
                }
            }
        }
        return ans;
    }
}
