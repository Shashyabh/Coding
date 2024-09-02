package com.coding.Practice;

import java.util.ArrayList;
import java.util.List;

public class ABC {
    public static void main(String[] args) {

        String str="himadamhowareyouoy";
        List<String> ans=new ArrayList<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                String subString=str.substring(i,j+1);
                if (isPalindrome(subString)){
                    if(subString.length()==1) continue;
                    ans.add(subString);
                }
            }
        }
        System.out.println(ans);
    }

    public static boolean isPalindrome(String str){
        int s=0;
        int e=str.length()-1;

        while (s<e){
            if (str.charAt(s++)!=str.charAt(e--)){
                return false;
            }
        }
        return true;
    }
}
