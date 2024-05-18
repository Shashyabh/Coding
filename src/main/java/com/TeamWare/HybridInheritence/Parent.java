package com.TeamWare.HybridInheritence;

interface Parent1{
    default void m1(){
        System.out.println("Parent1");
    }
}
interface Parent2{
    default void m1(){
        System.out.println("Parent2");
    }
}
class child implements Parent1,Parent2{
    public static void main(String[] args) {
        child c=new child();
        c.m1();
        c.show();
    }
    @Override
    public void m1() {
        Parent1.super.m1();
        Parent2.super.m1();
    }
    public void show(){
        Parent1.super.m1();
    }
}
