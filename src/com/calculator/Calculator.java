package com.calculator;

import com.calculator.exception.DivisionByZeroException;
import com.calculator.exception.IncorrectInputOperatorException;
import com.calculator.input.InputValueBean;
import com.calculator.input.InputValues;
import com.calculator.operations.*;
import com.calculator.screen.Screen;
import com.calculator.screen.ShowOutputOnConsole;
import com.calculator.screen.ShowOutputOnFile;

public class Calculator {

    public static void main(String[] args) throws IncorrectInputOperatorException, DivisionByZeroException {
        System.out.println("Insert input data(number, number, math operator):");
        InputValues input = new InputValues();

        int firstNumber = input.getInputValueNumberFromKeyboard();
        int secondNumber = input.getInputValueNumberFromKeyboard();
        String operator = input.getInputValueOperatorFromKeyboard();

        InputValueBean inputEquation = new InputValueBean(firstNumber, secondNumber, operator);

        float equationResult = Calculator.executeOperation(inputEquation.getFirstNumber(),
                inputEquation.getSecondNumber(), inputEquation.getOperator());

        ShowOutputOnConsole showOutputOnConsole = new ShowOutputOnConsole();
        showOutputOnConsole.showOutput(equationResult);

        ShowOutputOnFile showOutputOnFile = new ShowOutputOnFile();
        showOutputOnFile.showOutput(equationResult);



    }

    public static float executeOperation(int firstNumber, int secondNumber, String operator) throws DivisionByZeroException {
        float result = 0;
        Operation operation;

        switch (operator) {
            case "+":
                operation = new Addition();
                result = operation.calculate(firstNumber, secondNumber);
                break;
            case "-":
                operation = new Substraction();
                result = operation.calculate(firstNumber, secondNumber);
                break;
            case "*":
                operation = new Multiplication();
                result = operation.calculate(firstNumber, secondNumber);
                break;
            case "/":
                operation = new Division();
                result = operation.calculate(firstNumber, secondNumber);
                break;
        }
        return result;
    }
}
