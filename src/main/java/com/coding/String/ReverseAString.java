package com.coding.String;

public class ReverseAString {
    public static void main(String[] args) {
        //String str="My name is abhishek";
        String str="i.like.this.program.very.much";
        reveres(str);
    }

    private static void reveres(String str) {
//        String []word=str.split(" ");
//        String str2="";
//        for (int i = word.length-1; i >=0; i--) {
//            str2=str2+word[i]+" ";
//        }
//       s1= s1.trim().replaceAll(" +", " ");

        String []word=str.split("\\.");
        String str2="";
        for (int i = word.length-1; i >=1; i--) {
            str2=str2+word[i]+".";
        }
        str2=str2+word[0];

        System.out.println(str2);
    }
}
