package br.com.javacore.Rstring.test;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Isaias";
        nome = nome.concat(" Anjos");
        String nome2 = "Maria";
        String nome3 = new String(" Anjos"); //1 variavel de referencia , 2 - um objeto do tipo string, 3- Uma string no pool de string

        String teste = "Goku";
        String teste2 = "       0123456789";
        System.out.println(teste.charAt(3));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste2.replace('a','o'));
        System.out.println(teste2.toLowerCase());
        System.out.println(teste2.toUpperCase());
        System.out.println(teste2.substring(0,2));
        System.out.println(teste2.trim());
    }
}
