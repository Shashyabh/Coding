package com.coding.All;

import java.util.HashMap;

public class DuplicateElement {
    public static void main(String[] args) {
        int arr[]={3,4,4,6,6};
        duplicate(arr);
    }

    private static void duplicate(int[] arr) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i< arr.length;i++){
            int x=arr[i];
            Integer value=map.get(x);
            if(value==null){
                map.put(x,1);
            }
            else {
                map.put(x,value+1);
            }
        }

        map.entrySet().forEach(entry->{
            if (entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        });
    }
}
