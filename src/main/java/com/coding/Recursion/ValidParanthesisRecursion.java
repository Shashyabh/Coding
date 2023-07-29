package com.coding.Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParanthesisRecursion {
    public static void main(String[] args) {
        System.out.println(AllParenthesis(3));
    }
    public static List<String> AllParenthesis(int n)
    {
        // Write your code here
        List<String>ans=new ArrayList<>();
        f(n,ans,0,0,"");
        return ans;
    }

    public static void f(int n,List<String>ans, int open,int close, String str){
        if(open==n && close==n){
            ans.add(str);
            return;
        }
        if(open<n){
            f(n,ans,open+1,close,str+'(');
        }
        if(close<open){
            f(n,ans,open,close+1,str+')');
        }
    }

//    public static void f(int n, List<String> s, String str, int i){
//        if(i==n*2){
//            //s.add(str);
//            //System.out.println(str);
//            boolean flag=isValid(str);
//            //System.out.println(flag);
//            if(flag==true){
//                s.add(str);
//            }
//            return;
//        }
//
//        f(n,s,str+'(',i+1);
//        f(n,s,str+')',i+1);
//
//    }
//    public static boolean isValid(String str){
//        Stack<Character> st=new Stack<>();
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(ch=='('){
//                st.push(ch);
//            }
//            else{
//                if(st.isEmpty() || st.pop()!='('){
//                    return false;
//                }
//            }
//        }
//        return st.isEmpty();
//    }
}
