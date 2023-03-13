package com.coding.DSA.RESTALL;

public class RecursionCall {
    public static void main(String[] args) {
        int n=5;
        fun(n);
        fun1(n);
    }

    private static void fun1(int n) {
        if(n==0){
            return;
        }
        fun1(n - 1);
        System.out.println(n);

    }

    private static void fun(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n - 1);

    }
}
