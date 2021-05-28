package br.com.javacore.Oexception.error.test;

public class ErrorTest {
    public static void main(String[] args) {
        stackoverflowError();
    }

    public static void stackoverflowError(){
        stackoverflowError();
    }
}
