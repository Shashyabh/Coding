package com.SystemDesign.CreationalDesignPattern.FactoryDesignPattern;

public class ShapeFactory {

    public static Shape getShape(String type){

        if(type.equals("circle")){
            return new Circle();
        }
        else if (type.equals("square")){
            return new Square();
        }

        return null;
    }

    public static void main(String[] args) {

        Shape circle = ShapeFactory.getShape("circle");
        circle.draw();
        Shape square = ShapeFactory.getShape("square");
        square.draw();
    }
}
