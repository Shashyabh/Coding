package com.coding.All;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={10,110,30,80,50};
        int ans=0;
        for (int a:arr){
            ans^=a;
        }
        System.out.println(ans);
       //twoSum(arr);

    }

    private static void twoSum(int[] arr) {
        int sum = 160;
        //Brute force O(n2)
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j< arr.length;j++){
//                if(arr[i]+arr[j]==sum){
//                    System.out.println("( "+arr[i]+","+arr[j]+" )");
//                }
//            }
//        }
        //{10,20,30,40,50}
//        {10,110,30,80,50};

        HashMap<Integer, Integer> map = new HashMap<>();
         int[] arr1=new int[2];
        for (int i = 0; i < arr.length; i++) {
            int restSum = sum - arr[i];
            if(map.containsKey(restSum)){
                arr1[0]=i;
                arr1[1]=map.get(restSum);
            }else{
                map.put(arr[i],i);
            }
        }
        System.out.println(arr1[1]+","+arr1[0]);
//        map.entrySet().forEach(entry->{
//            System.out.println(entry.getKey()+" "+ entry.getValue());
//        });
    }
}
