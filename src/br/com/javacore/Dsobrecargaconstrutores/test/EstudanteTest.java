package br.com.javacore.Dsobrecargaconstrutores.test;

import br.com.javacore.Dsobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Willian S","987543-55", new double[]{5,7,9});
        estudante.imprime();

    }
}
