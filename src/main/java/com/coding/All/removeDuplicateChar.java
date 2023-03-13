package com.coding.All;

import java.util.HashSet;

public class removeDuplicateChar {

    public static void main(String[] args) {
        HashSet<Character> set=new HashSet<>();
        String str="Vishal Kumar Yadav";
        String str1="";
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            if(!set.contains(str.charAt(i)) && str.charAt(i)!=' '){
                set.add(str.charAt(i));
                str1=str1+str.charAt(i);
            }
        }
        System.out.println(str1);
    }
}
