package com.coding.StackAndQueue;

import java.util.Stack;

public class SortAStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(8);
        s.push(4);
        s.push(13);
        s.push(53);
        s.push(1);
        System.out.println(sortStack(s));
    }
    public static Stack<Integer> sortStack(Stack<Integer> s) {
        //////////Write your code here

        if(s.isEmpty()){
            return s;
        }
        int ele=s.pop();
        sortStack(s);
        f(s,ele);
        return s;
    }

    public static void f(Stack<Integer> s , int num){
        if(s.isEmpty() || s.peek()<=num){
            s.push(num);
            return;
        }
        int ele=s.pop();
        f(s,num);
        s.push(ele);
    }
}
