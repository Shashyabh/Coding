package com.coding.Recursion;

import java.util.Stack;

public class SortAStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(11);
        s.push(2);
        s.push(32);
        s.push(3);
        s.push(41);
        System.out.println(sort(s));
    }
    public static Stack<Integer> sort(Stack<Integer> s){
        //add code here.
        if(s.isEmpty()){
            return s;
        }
        int tmp=s.pop();
        sort(s);
        f(s,tmp);
        return s;
    }

    public static void f(Stack<Integer>s,int num){
        if(s.isEmpty()||s.peek()<=num){
            s.push(num);
            return;
        }

        int ele=s.pop();
        f(s,num);
        s.push(ele);
    }

    public static void sorttt(Stack<Integer> s)
    {
        //add code here.
        Stack<Integer> st = new Stack<Integer>();
        while(!s.isEmpty())
        {
            // pop out the first element
            int tmp = s.pop();
            // while temporary stack is not empty and
            // top of stack is greater than temp
            while(!st.isEmpty() && st.peek() > tmp){
                // pop from temporary stack and
                // push it to the input stack
                s.push(st.pop());
            }

            // push temp in tempory of stack
            st.push(tmp);
        }

        for(Integer c:st){
            System.out.println(c);
        }
        System.out.println("size ="+st.size());
    }
}
