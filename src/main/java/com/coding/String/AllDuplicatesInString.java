package com.coding.String;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AllDuplicatesInString {
    public static void main(String[] args) {
        String str="I am programmer and I am very good programmerr in Java I love good coding";

        String[] stt=str.split(" ");

        String s = Arrays.stream(stt).reduce((first, second) -> first.length() > second.length() ? first : second).get();
        System.out.println("Stream :  "+s);
        Map<String, Long> collect = Arrays.stream(stt).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Long>inte=new ArrayList<>();
        for(Map.Entry<String,Long> entry:collect.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        List<Character> vowels=Arrays.asList('a','e','i','o','u');
        long count = str.chars().mapToObj(c -> (char) c).filter(vowels::contains).count();
        System.out.println("Count===>>> "+count);




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
