package br.com.javacore.Texpressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        // \d - todos os digitos
        // \D - tudo que nao for digito
        // \s - espacos em branco \t \n \f \r
        // \S - caractere que nao e branco
        // \w - caracteres de palavras a-z A-Z, digitos e _
        // \W - tudo o que nao for caractere de palavra
        // []
        // ? - zero ou umma
        // * zero ou mais
        // + uma ou mais
        // {n,m} sw n ate m
        // ( )
        // | - ou
        // $
        // . curinga   1.3 = 123,133,1A3,1#3, 1 3

        int hex = 0x1;
//        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
//        String texto = "12 0x 0X 0x01FFABC 0x10G 0x1";
//        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
//        String texto = "fulano@hotmail.com, 102Abc@gmail.com, #@!abrao@mail.br, teste@gmail.com.br, teste@mail";

//        String regex = "\\d\\d/\\d\\d/\\d\\d\\d\\d";
        String regex = "\\d{2}/\\d{2}/\\d{2,4}";
        String texto = "05/10/2010 05/05/2015 1/1/01 01/05/95";
        System.out.println("Email valido? "+ "#@!abrao@mail.br".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: "+texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressao: "+matcher.pattern());
        System.out.println("posicoes encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() +" "+matcher.group());
        }
    }
}
