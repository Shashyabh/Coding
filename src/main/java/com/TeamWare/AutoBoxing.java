package com.TeamWare;

public class AutoBoxing {

    //Widening int converted into -----> double,float,long
    public double add(double a, int b) {
        return a + b;
    }

    //Autoboxing  primitive converted into corresponding wrapper class:::: int->>>>>> Integer
    public int add(Integer x){
        return x;
    }
    public static void main(String[] args) {
        AutoBoxing example = new AutoBoxing();
        //Widening
        System.out.println("Sum of two integers: " + example.add(5, 10));
        //Autoboxing
        System.out.println("Value of x : "+example.add(10));
    }
//    public void f(String str){
//        System.out.println("String");
//    }
//    public static void f(Integer a){
//        System.out.println("Static Int");
//    }
////    public static void abc(){
////        f("null");
////    }
   // public static void main(String[] args) {

//        When choosing between overloaded methods, Java prioritizes non-static methods
//        over static methods. So, in this case, even though both methods could technically
//        accept null, the non-static method with the String parameter will be chosen because
//    non-static methods are preferred over static methods during method resolution.
    //}
}
