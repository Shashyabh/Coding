package com.coding.String;

import java.util.HashMap;

public class Digit_to_words {
    public static void main(String[] args) {
        //input=4592
        //output=Four thousands five hundred ninety two
        System.out.println(f(26379));

    }

    public static String f(int n){

        String ans="";
        String [] ones={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve", "Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String tens[]= {"","", "Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

        if(n<20){
            ans=ones[n];
        }
        else if(n<100){
            ans=tens[n/10]+" "+f(n%10);
        }
        else if(n<1000){
            ans=f(n/100)+" Hundred "+f(n%100);
        }
        else if(n<1000000){
            ans=f(n/1000)+" Thousand "+f(n%1000);
        }
        else if(n<1000000000){
            ans=f(n/1000000)+" Million "+f(n%1000000);
        }
        else{
            ans = f(n/1000000000) + " Billion " + f(n%1000000000);
        }

        return ans.trim();
    }
}
