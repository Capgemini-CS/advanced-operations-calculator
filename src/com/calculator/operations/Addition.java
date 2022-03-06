package com.calculator.operations;

public class Addition implements Operation {
    @Override
    public float calculate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
