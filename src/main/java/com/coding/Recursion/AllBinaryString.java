package com.coding.Recursion;

import java.util.ArrayList;
import java.util.List;

public class AllBinaryString {
    public static void main(String[] args) {
        List<String> ans=new ArrayList<>();

        System.out.println(generateBinaryStrings(3));//000 , 001 , 010 , 100 , 101->>>>110not
    }
    public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> ans=new ArrayList<>();
        f(n,ans,"",0);
        return ans;

    }

    public static void f(int n,List<String> s, String str,int i){
        if(i==n){
            s.add(str);
            return;
        }
        // For generating all the sequences of 0 and 1
//        f(n,s,str+'0',i+1);
//        f(n,s,str+'1',i+1);
        // For generating all the sequences of 0,1 and not consecutive 1s
        if(i!=0 && str.charAt(i-1)=='1'){
            f(n,s,str+'0',i+1);
        }
        else{
            f(n,s,str+'0',i+1);
            f(n,s,str+'1',i+1);
        }
    }
}
