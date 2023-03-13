package com.coding.DSA.RESTALL;

import java.util.concurrent.ConcurrentHashMap;

public class progWithoutMain {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,Integer> map=new ConcurrentHashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.entrySet().forEach(entry->{
            if(entry.getValue()==2){
                map.put(3, 3);
            }
        });
        map.entrySet().forEach(entry->{
            System.out.println(entry.getKey()+" "+entry.getValue());
        });
    }
}
