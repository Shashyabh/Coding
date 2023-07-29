package com.coding.Practice;

import java.util.HashMap;

public class ConcurrentHashMap {

    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(1,2);
        map.put(2,4);
        System.out.println(map);
        map.entrySet().forEach(entry->{
            if(entry.getKey()==1){
                map.put(3,4);
            }
        });
        System.out.println(map);

    }
}
