package com.SystemDesign.CreationalDesignPattern.AbstractFactoryDesignPattern;

public class LuxuryFactory implements AbstractFactory{
    @Override
    public Car getInstance(int price) {
        if(price>=80000&&price<=120000){
            return new LuxuryCar1();
        }
        else  if(price>120000){
            return new LuxuryCar2();
        }
        return null;
    }
}
