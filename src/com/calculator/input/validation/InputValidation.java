package com.calculator.input.validation;

import com.calculator.exception.DivisionByZeroException;
import com.calculator.exception.IncorrectInputOperatorException;

public class InputValidation {

    public static boolean valueIsOneOfTheOperators(String value) throws IncorrectInputOperatorException {
        String allowedOperators = "+-*/";
        if (!allowedOperators.contains(value)) {
            throw new IncorrectInputOperatorException("This operator is not allowed!");
        }
        return true;
    }

    public static boolean numberIsNotZero(int value) throws DivisionByZeroException {
        if (value == 0) {
            throw new DivisionByZeroException("The division is not possible because second number is equals to zero.");
        }
        return true;
    }


}
