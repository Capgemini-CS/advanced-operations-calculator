package com.calculator.input;

import com.calculator.exception.IncorrectInputOperatorException;

public interface InputValuesConsoleInterface {

    int getInputValueNumberFromKeyboard();

    String getInputValueOperatorFromKeyboard() throws IncorrectInputOperatorException;
}
