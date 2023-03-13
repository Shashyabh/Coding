package com.coding.All;

import java.util.HashMap;

public class NoOfOccurance {
    public static void main(String[] args) {
        String str="banana";
        occured(str);
    }

    private static void occured(String str) {

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i< str.length();i++){
            char ch=str.charAt(i);
            Integer value=map.get(ch);
            if(value!=null){
                map.put(ch,(value+1));
            }
            else{
                map.put(ch,1);
            }
        }
        map.entrySet().forEach(entry->{
            System.out.println(entry.getKey()+" = "+entry.getValue());
        });
    }
}
