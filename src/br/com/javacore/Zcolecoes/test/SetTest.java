package br.com.javacore.Zcolecoes.test;

import br.com.javacore.Zcolecoes.classes.Produto;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123","Lenovo Notebook", 3500.00,0);
        Produto produto2 = new Produto("321","Picanha", 20.00,1);
        Produto produto3 = new Produto("879","Teclado Razer", 1000.00,0);
        Produto produto4 = new Produto("012","Samsung S7", 3450.00,1);
        Produto produto5 = new Produto("012","Samsung S7", 3450.00,1);
        Set<Produto> produtoSet = new LinkedHashSet<>();
        //hashSet - Nao permite elementos duplicados, nao tem indice para ordenacao
        //LinkedHashSet - permite elementos duplicados, tem indice para ordenacao
        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);
        produtoSet.add(produto5);
        for(Produto p : produtoSet){
            System.out.println(p);
        }

    }
}
