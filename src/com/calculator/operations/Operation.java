package com.calculator.operations;

import com.calculator.exception.DivisionByZeroException;

public interface Operation {

    float calculate(int firstNumber, int secondNumber) throws DivisionByZeroException;
}
