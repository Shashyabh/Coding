package com.neww;

import java.util.Arrays;
import java.util.HashMap;

public class Ramsai {
    public static void main(String[] args) {

        String input="divya:ivdya:hello:eholl";
        //Output : divya :2 , hello : 1

        String [] words=input.split(":");
        HashMap<String,Integer> map=new HashMap<>();

        for(String word:words){
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String str=new String(chars);
            map.put(str,map.getOrDefault(str,0)+1);
        }

        for (String word:words){
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String str=new String(chars);
            if (!map.containsKey(str)){
                continue;
            }
            System.out.println(word+" : "+map.get(str));
            map.remove(str);
        }
    }
}
