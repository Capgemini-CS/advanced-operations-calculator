package com.calculator.operations;

public class Multiplication implements Operation {

    @Override
    public float calculate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
