package br.com.javacore.Oexception.checkedexception.test;

import java.io.File;

public class CheckedExceptionTest {
    public static void main(String[] args) {
        criarArquivo();
    }

    public static void criarArquivo() {
        File file = new File("Texto.txt");
        try {
            System.out.println("Arquivo criado: " + file.createNewFile());
        } catch (Exception e) {
            System.out.println("Arquivo nao foi criado, talvez ja exista um com o mesmo nome");
            e.printStackTrace();
        }
    }
}
