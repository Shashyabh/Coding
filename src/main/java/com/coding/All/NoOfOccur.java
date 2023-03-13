package com.coding.All;

import java.util.HashMap;

public class NoOfOccur {
    public static void main(String[] args) {
        int arr[]={1,2,4,2};
        occur(arr);
    }

    private static void occur(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){

            int x=arr[i];
            Integer value=map.get(x);
            if(value!=null){
                map.put(x,value+1);
            }
            else {
                map.put(x,1);
            }
        }
//        map.entrySet().forEach(entry->{
//            System.out.println(entry.getKey()+ " is present "+ entry.getValue() +" times");
//        });
        final int[] sum = {0};
        map.entrySet().forEach(entry->{
            if(entry.getValue()==1){
                sum[0] = sum[0] + entry.getKey();
            }
        });
        System.out.println(sum[0]);
    }
}
