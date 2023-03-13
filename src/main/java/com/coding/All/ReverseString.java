package com.coding.All;

public class ReverseString {
    public static void main(String[] args) {
        String s="abc";
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            str+=ch;
        }
        System.out.println(str);
    }
}
