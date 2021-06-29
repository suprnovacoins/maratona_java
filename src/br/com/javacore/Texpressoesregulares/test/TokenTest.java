package br.com.javacore.Texpressoesregulares.test;

public class TokenTest {
    public static void main(String[] args) {
        String str = "Willian, Paulo, Joana, Camila, Anna, John, Matheus";
        String[] tokens = str.split(",");
        for (String arr : tokens){
            System.out.println(arr.trim());
        }
    }
}
