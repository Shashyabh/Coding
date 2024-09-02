package com.Practice;

import java.util.ArrayList;
import java.util.List;

public class PermutaionOfString {
    public static void main(String[] args) {
        String str="abc";
        List<String> ans=new ArrayList<>();
        f(0,"",str,ans);
        System.out.println(ans);
    }

    public static void  f(int index,String s,String str,List<String > ans){
        if(s.length()==str.length()){
            ans.add(s);
            return;
        }
        for(int i=0;i<str.length();i++){
            if(s.contains(str.charAt(i)+"")) continue;
            f(i+1,s+str.charAt(i),str,ans);
        }
    }
}
