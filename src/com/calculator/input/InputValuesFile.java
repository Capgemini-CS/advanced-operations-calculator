package com.calculator.input;

import com.calculator.exception.IncorrectInputOperatorException;
import com.calculator.exception.InvalidIndexException;
import com.calculator.exception.NotEnoughOperatorsException;
import com.calculator.input.validation.InputValidation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputValuesFile implements InputValuesFileInterface {

    @Override
    public int getInputValueNumberFromFile(ArrayList<String> inputFileLines, int index) {
        try {
            if (!InputValidation.totalNumbersOfOperatorsIsThree(inputFileLines)) {
                return 0;
            }
            if (!InputValidation.isIndexValid(index)) {
                return 0;
            }
        } catch (NotEnoughOperatorsException | InvalidIndexException e) {
            System.out.println(e.getMessage());
        }
        return InputValidation.stringToNumericValue(inputFileLines.get(index));
    }

    public int getFirstNumberValueFromFile(ArrayList<String> inputFileLines) {
        return getInputValueNumberFromFile(inputFileLines, 0);
    }

    public int getSecondNumberValueFromFile(ArrayList<String> inputFileLines) {
        return getInputValueNumberFromFile(inputFileLines, 1);
    }

    @Override
    public String getInputValueOperatorFromFile(ArrayList<String> inputFileLines) throws NotEnoughOperatorsException, IncorrectInputOperatorException {
        if (!InputValidation.totalNumbersOfOperatorsIsThree(inputFileLines)) {
            return null;
        }
        if (!InputValidation.valueIsOneOfTheOperators(inputFileLines.get(2))) {
            return null;
        }
        return inputFileLines.get(2);
    }

    public static ArrayList<String> getInputFromFileLineByLine(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = null;
        String line;
        ArrayList<String> inputFileLines = new ArrayList<>();

        try {
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                inputFileLines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
        return inputFileLines;
    }


}
