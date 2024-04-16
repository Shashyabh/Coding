package com.Ikshita;

public class Imshhs {
    public static void main(String[] args) {
        String str="acba";
        int len=str.length();
        boolean flag=false;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(len-i-1)){
                flag=false;
            }
            else{
                flag=true;
            }
        }

        if(!flag){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not");
        }
    }
}
