package com.calculator.input;

import com.calculator.exception.IncorrectInputOperatorException;
import com.calculator.input.validation.InputValidation;

import java.util.Scanner;

public class InputValues implements InputValuesInterface {
    static Scanner scanner = new Scanner(System.in);

    public InputValues() {

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
