package com.coding.DSA.RESTALL;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringSkipByRec {
    public static void main(String[] args) {
        String str="baccadab";
        String total="";
        String str1=recursionString(str);
        System.out.println(str1);
    }
    static int n=0;
    private static String recursionString(String str) {
        if(str.length()==0){
            return "";
        }

        //char ch=str.charAt(0);
//        if(ch!='a'){
//           char ans=str.charAt(0);
//            return recursionString(str.substring(1),total+ans);
//        }
//        return recursionString(str.substring(1),total);
        char ch=str.charAt(0);
        if(ch!='a'){
            return ch+recursionString(str.substring(1));
        }
        return recursionString(str.substring(1));

    }
}