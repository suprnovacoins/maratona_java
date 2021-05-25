package br.com.javacore.Bintroducaometodos.test;

import br.com.javacore.Bintroducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Isaias";
        estudante.idade = 25;
        estudante.notas = new double[]{6,7,8,9};
        estudante.print();
        estudante.tirarMedia();

    }
}
