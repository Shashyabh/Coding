package com.Ikshita;

import java.util.Stack;

class Calculator {
    private int currentValue;
    private Stack<Integer> history;
    private Stack<Integer> redoHistory;

    public Calculator() {
        currentValue = 0;
        history = new Stack<>();
        redoHistory = new Stack<>();
    }

    public void add(int value) {
        history.push(currentValue);
        currentValue += value;
        redoHistory.clear();
    }

    public void subtract(int value) {
        history.push(currentValue);
        currentValue -= value;
        redoHistory.clear();
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public boolean undo() {
        if (!history.isEmpty()) {
            redoHistory.push(currentValue);
            currentValue = history.pop();
            return true;
        }
        return false;
    }

    public boolean redo() {
        if (!redoHistory.isEmpty()) {
            history.push(currentValue);
            currentValue = redoHistory.pop();
            return true;
        }
        return false;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(5);
        calculator.add(5);
        calculator.add(5);
        calculator.add(5);
        System.out.println("Current Value: " + calculator.getCurrentValue());

        calculator.subtract(3);
        System.out.println("Current Value: " + calculator.getCurrentValue());

        calculator.undo();
        System.out.println("After Undo: " + calculator.getCurrentValue());

        calculator.redo();
        System.out.println("After Redo: " + calculator.getCurrentValue());
    }
}
