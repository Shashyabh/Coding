package com.coding.String;

import java.util.HashMap;
import java.util.Set;

public class AllDuplicatesInString {
    public static void main(String[] args) {
        String str="I am programmer and I am very good programmer in Java I love good coding";

        HashMap<String,Integer>map=new HashMap<>();
        String [] words=str.split(" ");
        for(String word:words){
            if(map.get(word)!=null){
                map.put(word,map.get(word)+1);
            }
            else {
                map.put(word,1);
            }
        }
        int maxLen=0;
        int currLen=0;
        Set<String> st=map.keySet();
        for(String word:st){
            if(map.get(word)>1){
                currLen=word.length();
                if(currLen>maxLen){
                    maxLen=currLen;
                }
            }
        }
        System.out.println(maxLen);
    }
}
