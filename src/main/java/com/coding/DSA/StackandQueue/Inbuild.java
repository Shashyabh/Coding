package com.coding.DSA.StackandQueue;

import java.util.Stack;

public class Inbuild {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(4);
        stack.push(5);
        stack.push(9);
        stack.push(11);
        //stack.peek();

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
