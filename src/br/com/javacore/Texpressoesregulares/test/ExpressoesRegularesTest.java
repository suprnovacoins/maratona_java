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

        int hex = 0x1;
        String regex = "0[xX] [0-9a-fA-F]";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: "+texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Expressao: "+matcher.pattern());
        System.out.println("posicoes encontradas");
        while (matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }

    }
}
