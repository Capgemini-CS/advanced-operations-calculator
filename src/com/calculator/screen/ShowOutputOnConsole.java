package com.calculator.screen;

public class ShowOutputOnConsole implements Screen{

    @Override
    public void showOutput(float result) {
        System.out.println("The result is: " + result);
    }
}
