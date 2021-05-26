package br.com.javacore.Minterfaces.test;

import br.com.javacore.Minterfaces.classes.Produto;

public class ProtudoTest {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook",5,3500);
        p.calculaImposto();
        p.calculaFrete();
        System.out.println(p);
    }
}
