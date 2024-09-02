package com.Practice;

public class StringBuilder {
    public static void main(String[] args) {

        String str="abc";
        str=str.concat("xyz");
        String s=new String("abc");
        java.lang.StringBuilder stringBuilder=new java.lang.StringBuilder();

        stringBuilder.append("abc");
        stringBuilder.append("xyz");
        System.out.println(stringBuilder);

        //str-> abc
        // ->abc
        //  str->abcxyz
        //abcxyz
        //System.out.println(str);
    }
}
