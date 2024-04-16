package com.coding.Recursion;

import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(11);
        s.push(2);
        s.push(32);
        s.push(3);
        s.push(41);
        System.out.println("original "+s);
        reverse(s);
    }
    static void reverse(Stack<Integer> s){
        // add your code here
        if(s.isEmpty()){
            return;
        }
        int tmp=s.pop();
        reverse(s);
        f(s,tmp);
        //System.out.println(s);
    }
    static void f(Stack<Integer> s, int ele){
        if(s.isEmpty()){
            s.push(ele);
            return;
        }
        int n=s.pop();
        f(s,ele);
        s.push(n);
    }
}
