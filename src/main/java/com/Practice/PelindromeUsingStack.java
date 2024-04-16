package com.Practice;

import java.util.Stack;

public class PelindromeUsingStack {

    public static void main(String[] args) {
        boolean flag=f("ajkhgvba");
        if(flag){
            System.out.println("Pelindrome");
        }
        else {
            System.out.println("Not ");
        }
    }

    public static boolean f(String str){
        Stack<Character> st=new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=st.pop()){
                return false;
            }
        }
        return true;
    }


}
