package com.calculator.operations;

public class Substraction implements Operation {
    @Override
    public float calculate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
