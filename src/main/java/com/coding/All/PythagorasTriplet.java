package com.coding.All;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PythagorasTriplet {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 8, 10, 13, 15};
        List<int[]> ans=f(nums);
        for (int[] a:ans){
            System.out.println(Arrays.toString(a));
        }
    }

    public static List<int[]> f(int arr[]){

        List<int[]> list=new ArrayList<>();

        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            int a=arr[i]*arr[i];

            int left=0;
            int right=i-1;
            while (left<right){
                int b=arr[left]*arr[left];
                int c=arr[right]*arr[right];
                if (a==b+c){
                    list.add(new int[]{arr[i],arr[left],arr[right]});
                    right--;
                    left++;
                } else if (a>b+c) {
                    left++;
                }
                else {
                    right--;
                }

            }
        }

        return list;
    }
}
