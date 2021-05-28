package br.com.javacore.Oexception.runtimeexception.test;

public class RunTimeExceptionTest {
    public static void main(String[] args) {
       Object o = null;
        int a = 10;
        int b = 0;
        if(b != 0) {
            System.out.println(a / b);
        }
        System.out.println(o.toString());
        int[] w = new int[2];
        System.out.println(w);
    }
}
