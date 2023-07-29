package com.interview;

public class New {
    public static void main(String[] args) {
        A a=new A();
        a.f(Integer.valueOf(5));
        a.f(6);
    }
}
class A{
    public void f(Integer x){
        System.out.println("Integer value called "+ x);
    }
    public void f(int x){
        System.out.println("Int value called "+x);
    }
}
