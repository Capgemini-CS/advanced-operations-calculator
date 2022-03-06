package com.calculator.exception;

public class DivisionByZeroException extends Exception {

    public DivisionByZeroException(String errorMessage) {
        super(errorMessage);
    }
}
