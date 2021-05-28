package br.com.javacore.Oexception.test;

public class ErrorTest {
    public static void main(String[] args) {
        stackoverflowError(); 
    }

    public static void stackoverflowError(){
        stackoverflowError();
    }
}
