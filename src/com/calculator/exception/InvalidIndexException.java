package com.calculator.exception;

import com.calculator.input.validation.InputValidation;

public class InvalidIndexException extends Exception {

    public InvalidIndexException(String errorMessage){
        super(errorMessage);
    }
}
