package br.com.javacore.Oexception.runtimeexception.test;

import java.io.IOException;

public class RunTimeExceptionTest {
    public static void main(String[] args) throws IOException {
//        try {
            divisao(10, 0);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static void divisao(double num1, int num2) {
//        if(num2==0){
////            throw new ArithmeticException("Nao é possivel divisao por 0");
//            throw new IllegalStateException("Nao é possivel divisao por 0");
//        }
        double result = num1 / num2;
        System.out.println(result);
    }
}
