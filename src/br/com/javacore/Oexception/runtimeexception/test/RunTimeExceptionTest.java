package br.com.javacore.Oexception.runtimeexception.test;

import java.io.IOException;

public class RunTimeExceptionTest {
    public static void main(String[] args) {
//       Object o = null;
//        int a = 10;
//        int b = 0;
//        if(b != 0) {
//            System.out.println(a / b);
//        }
//
//        System.out.println(o.toString());

        try {
            int[] w = new int[2];
            System.out.println(w[2]);
            System.out.println("Imprimindo depois da possibvel execucao");
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Fora do bloco catch");
        }
}
