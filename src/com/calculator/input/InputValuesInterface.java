package com.calculator.input;

import com.calculator.exception.IncorrectInputOperatorException;

public interface InputValuesInterface {

    int getInputValueNumberFromKeyboard();

    String getInputValueOperatorFromKeyboard() throws IncorrectInputOperatorException;
}
