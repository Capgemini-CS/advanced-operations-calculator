package com.calculator.menu;

import com.calculator.Calculator;
import com.calculator.exception.DivisionByZeroException;
import com.calculator.exception.IncorrectInputOperatorException;
import com.calculator.exception.NotEnoughOperatorsException;
import com.calculator.input.InputValuesConsole;
import com.calculator.input.InputValuesConsoleBean;
import com.calculator.input.InputValuesFile;
import com.calculator.output.ShowOutputOnConsole;
import com.calculator.output.ShowOutputOnFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorMenu {

    public static float equationResultForChosenInputMethod() throws IncorrectInputOperatorException, DivisionByZeroException, NotEnoughOperatorsException, IOException {
        float equationResult = 0;
        System.out.println("Choose input method: ");
        Scanner inputMethod = new Scanner(System.in);
        String methodType = inputMethod.nextLine();
        System.out.println(methodType);

        switch (methodType) {
            case "CONSOLE":
                System.out.println("Insert input data(number, number, math operator):");
                InputValuesConsole input = new InputValuesConsole();
                InputValuesConsoleBean inputEquation = new InputValuesConsoleBean(
                        input.getInputValueNumberFromKeyboard(),
                        input.getInputValueNumberFromKeyboard(),
                        input.getInputValueOperatorFromKeyboard());

                equationResult = Calculator.executeOperation(inputEquation.getFirstNumber(),
                        inputEquation.getSecondNumber(), inputEquation.getOperator());
                break;
            case "FILE":
                InputValuesFile inputValuesFile = new InputValuesFile();
                ArrayList<String> inputFileLines = InputValuesFile.getInputFromFileLineByLine(Calculator.INPUT_FILE_PATH);

                equationResult = Calculator.executeOperation(
                        inputValuesFile.getFirstNumberValueFromFile(inputFileLines),
                        inputValuesFile.getSecondNumberValueFromFile(inputFileLines),
                        inputValuesFile.getInputValueOperatorFromFile(inputFileLines));
                break;

        }
        return equationResult;
    }

    public static void chooseOutputMethod(float equationResult) {
        System.out.println("Choose output method: ");

        Scanner inputMethod = new Scanner(System.in);
        String methodType = inputMethod.nextLine();
        System.out.println(methodType);

        switch (methodType) {
            case "CONSOLE":
                ShowOutputOnConsole showOutputOnConsole = new ShowOutputOnConsole();
                showOutputOnConsole.showOutput(equationResult);
                break;
            case "FILE":
                ShowOutputOnFile showOutputOnFile = new ShowOutputOnFile();
                showOutputOnFile.showOutput(equationResult);
        }
    }
}
