package com.calculator.input;

import com.calculator.exception.IncorrectInputOperatorException;
import com.calculator.input.validation.InputValidation;

import java.util.Scanner;

public class InputValuesConsole implements InputValuesConsoleInterface {
    static Scanner scanner = new Scanner(System.in);

    public InputValuesConsole() {

    }

    @Override
    public int getInputValueNumberFromKeyboard() {
        return scanner.nextInt();
    }

    @Override
    public String getInputValueOperatorFromKeyboard() throws IncorrectInputOperatorException {
        String operator = scanner.next();
        if (!InputValidation.valueIsOneOfTheOperators(operator)) {
            return null;
        }
        return operator;
    }

}
