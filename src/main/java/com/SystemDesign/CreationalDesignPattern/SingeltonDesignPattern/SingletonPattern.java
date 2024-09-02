package com.SystemDesign.CreationalDesignPattern.SingeltonDesignPattern;

public class SingletonPattern implements Cloneable {

    public static SingletonPattern singletonPattern ;

    private SingletonPattern() throws Exception{
        if(singletonPattern !=null){
            throw new Exception("One instance has been created");
        }
    }
    public  static SingletonPattern singletonPatternMethod() throws Exception {
        if(singletonPattern ==null){
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {

        return singletonPattern;
//        return super.clone();
    }
}
