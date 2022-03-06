package com.calculator.input;

public class InputValuesConsoleBean {

    int firstNumber;
    int secondNumber;
    String operator;

    public InputValuesConsoleBean(int firstNumber, int secondNumber, String operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public String getOperator() {
        return operator;
    }
}
