package com.TeamWare;

public class Widening {
    public void method1 (int num1,float num2){
        System.out.println("int-float method");
    }
    public void method1(float num1,int num2){
        System.out.println("float-int method");
    }
    public static void main(String[] args){
        Widening interviewBit=new Widening();
        //interviewBit.method1(40,20);
    }
}
