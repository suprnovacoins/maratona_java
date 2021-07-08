package br.com.javacore.Vio.test;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {
        Console c = System.console();
        char[] pw = c.readPassword("%s", "pw: ");
        for (char pass: pw){
            c.format("%c ",pass);
        }
        c.format("\n");
        String texto;
        while(true){
            texto = c.readLine("%s, Digite: ");
            c.format("esse texto %s foi digitafo", retorno(texto))
        }

    }
    public static String retorno(String arg1){
        return retorno("Entrada de dados: "+arg1);
    }


}
