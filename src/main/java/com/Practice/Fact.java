package com.Practice;

import java.sql.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Fact {
    public static void main(String[] args) {
//        int n=10;
//        List<Integer> list = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            int fact = f(i);
//            list.add(fact);
//        }
//        System.out.println(list);
//        String str="101";
//        System.out.println(Integer.valueOf(str,2));

        // divya ,vidya ,idvya, hello ,elloh
        //divya:3 hello :2

        List<String> list= Arrays.asList("divya" ,"vidya" ,"idvya", "hello" ,"elloh");
        Map<String, Long> collect = list.stream().map(word -> {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
    public static int f(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
