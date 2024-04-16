package com.Practice.inter;

public class Test {
    interface A{
        //int a =0;
        default void f(){
            System.out.println("Interface A");
        }
    }

    interface B{
        default void f(){
            System.out.println("Interface B");
        }
    }

    static class C implements A,B{
        public static void main(String[] args) {
            new C().f();
        }
        @Override
        public void f() {
            B.super.f();
        }
    }
}
