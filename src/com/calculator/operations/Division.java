package com.calculator.operations;

import com.calculator.exception.DivisionByZeroException;
import com.calculator.input.validation.InputValidation;

public class Division implements Operation {


    @Override
    public float calculate(int firstNumber, int secondNumber) throws DivisionByZeroException {
        float result = 0;
        if (InputValidation.numberIsNotZero(secondNumber)) {
            result = firstNumber / secondNumber;
        }
        return result;
    }
}
