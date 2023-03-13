package com.coding.All;

public class FirstLetterPrinting {
    public static void main(String[] args) {
        String str="Learn with Shashyabh and Nikhil";
        splitword(str);
    }

    public static void splitword(String str){

        String words[]=str.split(" ");
        for(int i=0;i<words.length;i++){
            String s=words[i];
            System.out.println(s.charAt(0));
        }
    }
}
