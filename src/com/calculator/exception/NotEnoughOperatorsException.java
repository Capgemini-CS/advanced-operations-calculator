package com.calculator.exception;

public class NotEnoughOperatorsException extends Exception{

    public NotEnoughOperatorsException(String errorMessage){
        super(errorMessage);
    }
}
