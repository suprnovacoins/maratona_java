package br.com.javacore.Bintroducaometodos.test;

import br.com.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        System.out.println("Continuacao......");
        calc.subtraiDoisNumeros();
        System.out.println("Continuacao......");
        calc.multiplicaDoisNumeros(2,5);
        System.out.println("Continuacao......");
        calc.divideDoisNumeros(20,2);
        System.out.println("Continuacao......");
        calc.imprimeDoisNumerosDivididos(10,0);

        System.out.println("Cont...");
        int[] numeros = {1,2,3,4,5,};
        calc.somaArray(numeros);

        System.out.println("Cont...");
        calc.somaVarArgs(1,2,3,4,5);

    }
}
