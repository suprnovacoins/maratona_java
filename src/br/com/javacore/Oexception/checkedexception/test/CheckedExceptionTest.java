package br.com.javacore.Oexception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args){
        abrirArquivo();
//        try {
//            criarArquivo();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public static void criarArquivo() throws IOException {
        File file = new File("Texto.txt");
        try {
            file.createNewFile();
            System.out.println("Arquivo criado");
        } catch (Exception e) {
            System.out.println("Arquivo nao foi criado, talvez ja exista um com o mesmo nome");
            e.printStackTrace();
            throw e;
        }
    }

    public static String abrirArquivo() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Executando leitura do arquivo");
//            throw new Exception();
            System.out.println("Escrevendo no arquivo");
            return "Valor";
        } catch (Exception e) {
            System.out.println("Dentro do catch");
            e.printStackTrace();
        }finally {
            System.out.println("Fechar arquivo");
        }
        return null;
    }
}
