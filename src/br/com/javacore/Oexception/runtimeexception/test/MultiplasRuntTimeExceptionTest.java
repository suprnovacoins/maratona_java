package br.com.javacore.Oexception.runtimeexception.test;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntTimeExceptionTest {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (ArithmeticException | IllegalArgumentException | ArrayIndexOutOfBoundsException a) {
            System.out.println("Dentro de ArrayIndexOutOfBoundsException");
        }
        System.out.println("Final do programa");

        try {
            talvezLanceException();
        } catch (Exception e) {
        }
    }

    private static void talvezLanceException() throws SQLException, AWTException, IOException {

    }
}
