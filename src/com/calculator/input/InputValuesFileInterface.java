package com.calculator.input;

import com.calculator.exception.IncorrectInputOperatorException;
import com.calculator.exception.NotEnoughOperatorsException;

import java.util.ArrayList;

public interface InputValuesFileInterface {
    int getInputValueNumberFromFile(ArrayList<String> inputFileLines, int index);

    String getInputValueOperatorFromFile(ArrayList<String> inputFileLines) throws NotEnoughOperatorsException, IncorrectInputOperatorException;
}
