package com.coding.String;

import java.util.Stack;

public class RemoveAdjacentSimilarString {
    public static void main(String[] args) {
        String str="abbaca";
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String s) {

        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(st.isEmpty()){
                st.push(curr);
            }
            else if(st.peek()==curr){
                st.pop();
            }
            else{
                st.push(curr);
            }
        }

        String n="";
        while(!st.isEmpty()){
            n=st.pop()+n;
        }
        return n;
    }
}
