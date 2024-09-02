package com.SystemDesign.CreationalDesignPattern.AbstractFactoryDesignPattern;

public class AbstractFactoryProducer {

    public static AbstractFactory getFactoryInstance(String type){

        if(type.equals("luxury")){
            return new LuxuryFactory();
        }
        else if(type.equals("economic")){
            return new EconomicFactory();
        }

        return null;
    }

    public static void main(String[] args) {
        AbstractFactory luxury = AbstractFactoryProducer.getFactoryInstance("luxury");

        Car instance = luxury.getInstance(14000000);
        int speed = instance.getSpeed();
        System.out.println(speed);

    }
}
