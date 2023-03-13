package com.coding.leetcode;

public class StringPanagram {
    public static void main(String[] args) {
        String str="thequickbrownfoxjumpsoverthelazydog";
        if(str.length()<26){
            System.out.println("No");
        }
        else {
            for(char i='a';i<='z';i++){
                if(str.indexOf(i)<0){
                    System.out.println(str.indexOf(i));
                    System.out.println("No");
                }
            }
            System.out.println("Yes");
        }

    }

}
