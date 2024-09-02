package com.TeamWare;

import java.util.*;

public class ElementFrequency {
    public static void main(String[] args) {
        String input = "divya:vyaid:hello:ehlol";
        Map<String, Integer> map = new HashMap<>();

        String[] elements = input.split(":");

        for(String str:elements){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(String str:elements){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            if(map.containsKey(s)) {
                System.out.println(str + ": " + map.get(s));
            }
        }







//        for(String str:elements){
//            char[] ch=str.toCharArray();
//            Arrays.sort(ch);
//            String s=new String(ch);
//            if(!map.containsKey(s)){
//                continue;
//            }
//            System.out.println(str+": "+map.get(s));
//            map.remove(s);
//        }
    }
}


