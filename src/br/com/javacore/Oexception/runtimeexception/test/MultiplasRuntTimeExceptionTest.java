package br.com.javacore.Oexception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasRuntTimeExceptionTest {
    public static void main(String[] args) {
        try{
            throw new IllegalArgumentException();
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Dentro de ArrayIndexOutOfBoundsException");
        }catch (IllegalArgumentException i){
            System.out.println("Dentro de IllegalArgumentException");
        }catch (ArithmeticException ari){
            System.out.println("Dentro de ArithmeticException");
        }catch (RuntimeException ari){
            System.out.println("Dentro de RuntimeException");
        }
        System.out.println("Final do programa");

        try {
            talvezLanceException();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
