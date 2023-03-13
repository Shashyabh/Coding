package com.coding.All;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        String longestTillNow="";
        String longestOverall="";

        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                longestTillNow+=ch;
            }
            else{
                set.clear();
                longestTillNow="";
            }
            if(longestOverall.length()<longestTillNow.length()){
                longestOverall=longestTillNow;
            }
        }

        System.out.println(longestOverall);
    }
}
