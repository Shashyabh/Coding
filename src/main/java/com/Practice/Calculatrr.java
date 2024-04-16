package com.Practice;

import java.util.Stack;

public class Calculatrr {

    public static class Cal{
        public int currentValue;
        Stack<Integer> history;
        Stack<Integer> redoHistory;

        public Cal(){
            currentValue=0;
            history=new Stack<>();
            redoHistory=new Stack<>();
        }

        public void add(int value){
            history.push(currentValue);
            currentValue+=value;
            redoHistory.clear();
        }

        public void substract(int value){
            history.push(currentValue);
            currentValue-=value;
            redoHistory.clear();
        }

        public int getCurrentValue(){
            return currentValue;
        }


        public boolean undo(){
            if(!history.isEmpty()){
                redoHistory.push(currentValue);
                currentValue=history.pop();
                return true;
            }
            return false;
        }

        public boolean redo(){
            if(!redoHistory.isEmpty()){
                history.push(currentValue);
                currentValue=redoHistory.pop();
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Cal calculator = new Cal();

        calculator.add(5);
        calculator.add(5);
        calculator.add(5);
        calculator.add(5);
        System.out.println("Current Value: " + calculator.getCurrentValue());

        calculator.substract(3);
        System.out.println("Current Value: " + calculator.getCurrentValue());

        calculator.undo();
        System.out.println("After Undo: " + calculator.getCurrentValue());

        calculator.redo();
        System.out.println("After Redo: " + calculator.getCurrentValue());

    }
}
