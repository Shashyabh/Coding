package com.OraclePrep;

import java.util.*;

public class Four_Sum {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,9,1,12,3,5};
        f(arr,14);
    }

    public static void f(int arr[],int sum){
        Arrays.sort(arr);
        int n=arr.length;
        List<List<Integer>>ans=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) continue;
            for (int j = i+1; j < arr.length; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;
                int k=j+1;
                int l=n-1;
                while (k<l){
                    int total=arr[i]+arr[j]+arr[k]+arr[l];

                    if(total<sum){
                        k++;
                    } else if (total>sum) {
                        l--;
                    }
                    else {
                        List<Integer>temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        //temp.sort(Integer::compareTo);
                        ans.add(new ArrayList<>(temp));

                        k++;
                        l--;

                        while (k<l && arr[k]==arr[k-1])k++;
                        while (k<l && arr[l]==arr[l+1])l--;
                    }
                }
            }
        }
//        List<List<Integer>>ans=new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                Set<Integer> set=new HashSet<>();
//                for (int k = j+1; k < arr.length; k++) {
//                    int total=sum-(arr[i]+arr[j]+arr[k]);
//
//                    if(set.contains(total)){
//                        List<Integer>temp=new ArrayList<>();
//                        temp.add(arr[i]);
//                        temp.add(arr[j]);
//                        temp.add(arr[k]);
//                        temp.add(total);
//                        temp.sort(Integer::compareTo);
//                        ans.add(temp);
//                    }
//                    else {
//                        set.add(arr[k]);
//                    }
//                }
//            }
//        }

        System.out.println(ans);
    }
}
