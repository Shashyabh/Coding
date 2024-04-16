package com.neww;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class ABBA {
    public static void main(String[] args) {
        Hashtable<Integer,Integer> map=new Hashtable<>();
        map.put(1, 10);
        map.put(1, 10);
        map.put(2, 10);
        map.put(2, 10);
        map.entrySet().stream().forEach(entry->{
            System.out.println(entry.getKey()+" "+entry.getValue());
        });
    }
}
