package com.coding.String;

public class No_OfChangingString {
    public static void main(String[] args) {
        System.out.println(f("aAbBcC"));
    }
    public static int f(String s){
        int count=0;

        s=s.toLowerCase();
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)==s.charAt(i+1)){
                continue;
            }
            else {
                count++;
            }
        }
        return count;
    }
}
