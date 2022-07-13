package com.epam.training.student_Vitali_Semenov.Exception.Task2.CatchEmAll;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {
    //You may set another exception in this field;
    static Exception exception = new FileNotFoundException();

    public static void riskyMethod() throws Exception {
        throw exception;
    }

    public static void main(String[] args) throws Exception {
        try {
            riskyMethod();
        } catch (FileNotFoundException exp1){
            throw new IllegalArgumentException("Resource is missing", exp1);
        } catch (IOException exp2){
            throw new IllegalArgumentException("Resource error", exp2);
        } catch (ArithmeticException | NumberFormatException exp3){
            System.err.println(exp3.getMessage());
        }
    }
}
