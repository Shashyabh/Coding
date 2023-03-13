package com.coding.DSA.String;

public class ReverseAString {
    public static void main(String[] args) {
        String str="My name is abhishek";
        reveres(str);
    }

    private static void reveres(String str) {
        String []word=str.split(" ");
        String str2="";
        for (int i = word.length-1; i >=0; i--) {
            str2=str2+word[i]+" ";
        }
        //s1= s1.trim().replaceAll(" +", " ");
        System.out.println(str2);
    }
}
