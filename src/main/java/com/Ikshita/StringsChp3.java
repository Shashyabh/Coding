package com.Ikshita;

public class StringsChp3 {
    public static void main(String args[]){
        String name = "IKSHITA";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String name2 = "   Ikshita   ";
        System.out.println(name2.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,4));
        System.out.println(name.replace("I","A"));

    }
}
