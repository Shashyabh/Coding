package com.coding.String;

public class LengthOflastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        lengthOfLast(s);
    }

    public static int lengthOfLast(String s){

        String[] word=s.split(" ");
//        for (int i = 0; i < word.length; i++) {
//            //System.out.println(word[i].trim().replaceAll(" +",""));
//        }
        System.out.println(s.trim().replaceAll(" +"," "));
        System.out.println(word[word.length-1].length());


        return 1;
    }
}
