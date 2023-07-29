package com.coding.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutaionOfStrinf {
    public static void main(String[] args) {
        List<String>ans=new ArrayList<>();
        String s="abc";
        f(ans,"",s);
        System.out.println(ans);
    }
    public static void f(List<String>ans,String str,String s){
        if(s.length()==0){
            ans.add(str);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            String total=left+right;
            f(ans,str+ch,total);
        }
    }
}
