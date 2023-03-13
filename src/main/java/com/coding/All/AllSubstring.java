package com.coding.All;

import java.util.HashSet;

public class AllSubstring {
    public static void main(String[] args) {
        String str="abc";//a,ab,ac,b,bc,c,abc
        printSubstring(str);
    }

    private static void printSubstring(String str) {
        HashSet<String> s=new HashSet<>();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
        System.out.println(s);
    }
}
