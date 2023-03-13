package com.coding.All;

import java.util.Stack;

public class ReverseUsingStack {
    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();
        int arr[]={3,1,5,4};
      //  Stack stack=new Stack<Integer>();
        for(int i=0;i< arr.length;i++){
            stack.push(arr[i]);
        }
        for(int i=0;i< arr.length;i++){
            arr[i]=(int)stack.pop();
            System.out.print(" "+arr[i]);
        }
    }
}
