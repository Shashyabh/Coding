package com.SystemDesign.CreationalDesignPattern.AbstractFactoryDesignPattern;

public class EconomicFactory implements AbstractFactory{
    @Override
    public Car getInstance(int price) {
        if(price<=30000){
            return new EconomicCar1();
        }
        else  if(price<=50000 && price>30000){
            return new EconomicCar2();
        }
        return null;
    }
}
