package com.coding.DSA.String;

import java.util.HashMap;

public class CountTheFrqOfSpeificWord {
    public static void main(String[] args) {
        String str="I am programmer and I am very good programmer in Java I love programmer good coding";
        String[] words=str.split(" ");
        HashMap<String,Integer>map=new HashMap<>();
        for(String word:words){
            if(map.get(word)!=null){
                map.put(word,map.get(word)+1);
            }
            else {
                map.put(word,1);
            }
        }

        map.entrySet().forEach(entry->{
            if(entry.getValue()>1&&entry.getKey().equals("programmer")){
                System.out.println(entry.getKey()+" is repeated "+entry.getValue() +" times");
            }
        });

//        Set<String>set=map.keySet();
//        for(String word:set){
//            if(map.get(word)>1){
//                System.out.println(word);
//            }
//        }
    }
}
