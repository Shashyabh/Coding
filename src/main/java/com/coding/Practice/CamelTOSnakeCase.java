package com.coding.Practice;

public class CamelTOSnakeCase {
    public static void main(String[] args) {
        String str = "whatIsYourName";
        camelToSnake(str);
    }
    public static void camelToSnake(String str){
        String result="";
        char ch=Character.toUpperCase(str.charAt(0));
        result=result+ch;
        for (int i = 1; i <str.length() ; i++) {
            if(Character.isUpperCase(str.charAt(i))){
                result=result+"_"+str.charAt(i);
            }
            else{
                result=result+Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(result);
    }
}
