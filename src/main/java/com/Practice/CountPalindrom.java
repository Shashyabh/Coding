package com.Practice;

import java.util.ArrayList;
import java.util.List;

public class CountPalindrom {
    public static void main(String[] args) {

        String str="himadamhowareyouoy";

        List<String> temp=f(str);
        System.out.println(temp);
    }

    public static List<String> f(String str){
        List<String> ans=new ArrayList<>();

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                String subString=str.substring(i,j+1);
                boolean flag=isPelindrome(subString);
                if(flag==true){
                    if(subString.length()<=1) continue;
                    ans.add(subString);
                }
            }
        }

        return ans;
    }

    public static boolean isPelindrome(String str){

        int s=0;
        int e=str.length()-1;

        while (s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;

    }
}
