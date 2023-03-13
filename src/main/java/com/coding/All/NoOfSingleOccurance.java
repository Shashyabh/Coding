package com.coding.All;

import java.util.HashMap;

public class NoOfSingleOccurance {
    public static void main(String[] args) {
        int arr[]={2,4,2,1,2,2,2,4,3,4,7,4,9,4};
        occure(arr);
    }

    private static void occure(int[] arr) {
        int i;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<arr.length;i++){

            int x=arr[i];
            Integer value=map.get(x);
            if(value!=null){
                map.put(x ,value+1);
            }
            else{
                map.put(x,1);
            }
        }
        final int[] max = {0,0};
        map.entrySet().forEach(entry->{
            if(entry.getValue()> max[0]){
                max[0] = entry.getValue();
                max[1]= entry.getKey();
            }
        });
        System.out.println(max[1]+" is "+max[0]+" times repeated");
    }
}
