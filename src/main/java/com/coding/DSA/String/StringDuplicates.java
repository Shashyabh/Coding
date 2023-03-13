package com.coding.DSA.String;

import java.util.Stack;

public class StringDuplicates {
    public static void main(String[] args) {
        String s = "abbaca";
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
