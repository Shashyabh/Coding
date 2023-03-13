package com.coding.All;

import java.util.HashMap;

public class RepeatElement {
    public static void main(String[] args) {
        int arr[]={2,1,4,2,2,2,2,6,7,4,8,4,9};
        repeatFun(arr);
    }

    private static void repeatFun(int[] arr) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            Integer value=map.get(x);
            if(value!=null){
                map.put(x,value+1);
            }
            else {
                map.put(x,1);
            }
        }
        map.entrySet().forEach(entry->{
            if(entry.getValue()>1){
                System.out.println(entry.getKey() +" is repeated element and repeated "+ entry.getValue()+" times");
            }
        });
    }
}
