package br.com.javacore.Oexception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args){
        try {
            criarArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void criarArquivo() throws IOException {
        File file = new File("Texto.txt");
        try {
            System.out.println("Arquivo criado: " + file.createNewFile());
        } catch (Exception e) {
            System.out.println("Arquivo nao foi criado, talvez ja exista um com o mesmo nome");
            e.printStackTrace();
            throw e;
        }
    }
}
