package com.coding.DSA.String;

public class SplitIntoThreeWord {
    public static void main(String[] args) {
        String str="abchkeosmekkenienmdkenke";
        String s="";
        for (int i = 0; i <str.length()-3 ; i=i+3) {
            s=s+str.substring(i,i+3)+" ";
        }
        System.out.println(s);
    }
}
