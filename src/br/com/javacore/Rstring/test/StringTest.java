package br.com.javacore.Rstring.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Isaias";
        nome = nome.concat(" Anjos");
        String nome2 = "Maria";
        String nome3 = new String(" Anjos"); //1 variavel de referencia , 2 - um objeto do tipo string, 3- Uma string no pool de string
        System.out.println(nome);
    }
}
