package com.coding.DP;

import java.util.ArrayList;
import java.util.List;

public class CountOfDistinctString {
    public static void main(String[] args) {
        System.out.println(countDistinctSubstring("ababa"));
    }
    public static int countDistinctSubstring(String st)
    {
        //your code here
        List<String> ans=new ArrayList<>();
        f(st,ans,"",0);
        return ans.size();

    }
    public static void f(String st,List<String>ans,String str,int i){
        if(i==st.length()){

            if(!ans.contains(str)){
                System.out.println(str);
                ans.add(str);
            }
            return;
        }
        f(st,ans,str+st.charAt(i),i+1);
        f(st,ans,str,i+1);
    }
}
