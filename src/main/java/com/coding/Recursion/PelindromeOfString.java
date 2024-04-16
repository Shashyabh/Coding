package com.coding.Recursion;

public class PelindromeOfString {
    public static void main(String[] args) {
        String str="AMKMA";
        System.out.println(f(str));
    }

    public static boolean f(String s){

        if(s.length()<=1){
            return true;
        }

        if(s.charAt(0)==s.charAt(s.length()-1)){
            return f(s.substring(1, s.length()-1));
        }
        else {
            return false;
        }

    }
}
