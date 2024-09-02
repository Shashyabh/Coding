package com.Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Duplicate {
    public static void main(String[] args) {

//        int [] arr2={2,1,9,10,5};

        //(1,9)  (2,8) (3,7) (4,6) (5,5) (6,4) (7,3) (8,2) (9,1) (10,0)
        int []arr1={1,2,3,4,5,6,7,8,9,10,11,12};//9 (4,5) (6,3)/// 1,8  2,7  3,6  4,5  5,4  6,3
        int k=15;
        List<List<Integer>> list1=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            List<Integer>ans=new ArrayList<>();
            int rest=k-arr1[i];
            if(map.containsKey(rest)){
                ans.add(rest);//3
                ans.add(map.get(rest));//7
                list1.add(ans);
            }
            map.put(arr1[i],rest);
        }

        System.out.println(list1);



        List<List<Integer>> list=new ArrayList<>();
//        List<int[]> list1=new ArrayList<>();
//
//        List<Integer>ans1=new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            List<Integer>ans=new ArrayList<>();
            //int[] ans3=new int[2];
            for(int j=0;j<arr1.length;j++){
                if(arr1[i]+arr1[j]==9){
//                    ans3[0]=arr1[i];
//                    ans3[1]=arr1[j];
                    ans.add(arr1[i]);
                    ans.add(arr1[j]);
                    list.add(ans);
//                    list1.add(ans3);

                }
            }
        }
        //System.out.println(list);
//        for(int[]a:list1){
//            System.out.println(a[0]+" "+a[1]);
//        }
//        System.out.println(ans1);
//        System.out.println();
//
//
//        HashSet<Integer> set=new HashSet<>();
//
//        for(int a:arr1){
//            set.add(a);
//        }
//
//        for(int a:arr2){
//            if(set.contains(a)){
//                ans.add(a);
//            }
//        }
//        System.out.println(ans);
    }
}
