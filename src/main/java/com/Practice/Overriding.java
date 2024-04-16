package com.Practice;

public class Overriding {
    public static void main(String[] args) {
        A a=new B();
        a.show();
        System.out.println(a.i);
//        B b=new B();
//        b.show1();
//        System.out.println(b.i);
    }
}
class A{
    int i=10;
    public void show(){
        System.out.println("A");
    }
}

class B extends A{
    int i=20;
    public void show(){
        System.out.println("B is showing");
    }
    public void show1(){
        System.out.println("A is showing new ");
    }
}
