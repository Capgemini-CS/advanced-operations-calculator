package com.calculator.screen;

import java.io.*;

public class ShowOutputOnFile implements Screen{

    static final String FILE_NAME = "ShowEquationResult.txt";

    @Override
    public void showOutput(float result)  {
        try {
            createFileToWriteOutput(result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void createFileToWriteOutput(float value) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        try(fileOutputStream; outputStreamWriter; bufferedWriter){
            bufferedWriter.write("Result is: " + value);
            bufferedWriter.newLine();

        }catch (IOException e){
            e.printStackTrace();
        }
    }



}
