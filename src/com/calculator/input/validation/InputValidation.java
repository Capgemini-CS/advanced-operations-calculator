package com.calculator.input.validation;

import com.calculator.exception.DivisionByZeroException;
import com.calculator.exception.IncorrectInputOperatorException;
import com.calculator.exception.InvalidIndexException;
import com.calculator.exception.NotEnoughOperatorsException;

import java.util.ArrayList;
import java.util.List;

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

    public static int stringToNumericValue(String value) {
        int number = 0;
        try {
            number =  Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println("The value is not numeric.");
        }
        return number;
    }

    public static boolean totalNumbersOfOperatorsIsThree(ArrayList<String> listOfOperators) throws NotEnoughOperatorsException {
        if(listOfOperators.size() != 3){
            throw new NotEnoughOperatorsException("There are not enough operators in input file.");
        }
        return true;
    }

    public static boolean isIndexValid(int index) throws InvalidIndexException {
        if(index > 3){
            throw new InvalidIndexException("Given index is greater than total number of operators from input file.");
        }
        return true;
    }



}
