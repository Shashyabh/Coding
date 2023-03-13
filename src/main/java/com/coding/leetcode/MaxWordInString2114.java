package com.coding.leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class MaxWordInString2114 {

    public static void main(String[] args) {
        String[] str={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int newCh=0;
        for(String s:str){
            int ch=s.split(" ").length;
            if(ch>newCh){
                newCh=ch;
            }
        }
        System.out.println(newCh);
    }
}
