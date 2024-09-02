package com.SystemDesign.CreationalDesignPattern.SingeltonDesignPattern;

public class SingeltonPatternMainClass {
    public static void main(String[] args) throws Exception {
        SingletonPattern singeltonPattern = SingletonPattern.singletonPatternMethod();
        System.out.println(singeltonPattern.hashCode());
        SingletonPattern singeltonPattern1 = SingletonPattern.singletonPatternMethod();
        System.out.println(singeltonPattern1.hashCode());

        SingletonPattern clone = (SingletonPattern)singeltonPattern.clone();
        System.out.println(clone.hashCode());



        //Reflection
//        Constructor<SingeltonPattern> declaredConstructor = SingeltonPattern.class.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//        System.out.println(declaredConstructor.newInstance().hashCode());
    }
}
