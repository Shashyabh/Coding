package com.coding.All;

public class PanagranString {
    public static void main(String[] args) {
        String s="The quick brown fox jumps over the lazy dog";

        System.out.println(isPanagram(s));
    }
    public static boolean isPanagram(String s){
        if(s.length()<26){
            return false;
        }
        else {
            for(char ch='a';ch<'z';ch++) {
                if (s.indexOf(ch) < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
