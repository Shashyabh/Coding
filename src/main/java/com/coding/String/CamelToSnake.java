package com.coding.String;

public class CamelToSnake {
    public static void main(String[] args) {
        String str = "whatIsYourName";

        //Output-> WHAT_IS_YOUR_NAME
        System.out.print(camelToSnake(str));
    }

    private static String camelToSnake(String str) {

        String s1="";
        char ch=str.charAt(0);
        s1=s1+Character.toUpperCase(ch);
        for (int i = 1; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))){
                s1=s1+"_"+str.charAt(i);
            }
            else{
                s1=s1+Character.toUpperCase(str.charAt(i));
            }
        }
        return s1;

    }
}
