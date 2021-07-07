package br.com.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FIleDiretorioTest {
    public static void main(String[] args) throws IOException {
//        File diretorio = new File("folder");
//        boolean mkdir = diretorio.mkdir();
//        System.out.println("Diretorio criado "+ mkdir);
////        File arquivo = new File("C:\\Users\\isaia\\Documents\\maratona_java\\folder\\arquivo.txt");
//        File arquivo = new File(diretorio,"arquivo.txt");
//        boolean newFile = arquivo.createNewFile();
//        System.out.println("Arquivo criado "+ newFile);
//
//        File arquivoNovoNome = new File(diretorio,"Arquivo_renomeado.txt");
//        boolean renamed = arquivo.renameTo(arquivoNovoNome);
//        System.out.println("Renomeado "+renamed);
//
//        File diretorioRenomeado = new File("folder2");
//        boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeado);
//        System.out.println("Diretorio renomeado "+diretorioRenamed);
//
        buscaArquivo();
    }

    public static void buscaArquivo(){
        File file = new File("folder2");
        String[] list = file.list();
        for (String arquivo: list){
            System.out.println(arquivo);
        }
    }

}
