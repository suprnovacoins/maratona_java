package br.com.javacore.Rstring.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s = "Uma frase comum";
        StringBuilder sb = new StringBuilder(16);
        sb.append("0123456789");
        System.out.println(sb.insert(2,"***"));
        System.out.println("=====================");
        sb.append("Uma frase comum");
        System.out.println(sb.reverse());
    }
}
