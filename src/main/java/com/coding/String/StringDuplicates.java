package com.coding.String;

import java.util.Arrays;
import java.util.Map;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringDuplicates {
    public static void main(String[] args) {
        String s = "abbaca";

        String[] str=s.split("");
        Map<String, Long> collect = Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(Map.Entry<String,Long> st:collect.entrySet()){
            if(st.getValue()==1){
                System.out.println("Non Repeated value = "+st.getKey());
            }
        }

        duplicates(s);
    }

    private static void duplicates(String name) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<name.length()-1;i++){
            char ch=name.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(st.peek()==ch){
                st.pop();
            }
            else {
                st.push(ch);
            }
        }
        System.out.println(st);
    }
}
