package br.com.javacore.Oexception.checkedexception.test;

import br.com.javacore.Oexception.checkedexception.classes.Leitor1;
import br.com.javacore.Oexception.checkedexception.classes.Leitor2;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        lerArquivoLeitor();
    }

    public static void lerArquivoLeitor() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivo() {
        try (Reader reader = new BufferedReader(new FileReader("Texto.txt"))) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivoOld() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("Texto.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
