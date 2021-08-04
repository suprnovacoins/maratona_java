package br.com.javacore.Zcolecoes.test;

import br.com.javacore.Zcolecoes.classes.Celular;
import br.com.javacore.Zcolecoes.classes.Produto;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class CelularNomeComparator implements Comparator<Celular> {

    @Override
    public int compare(Celular o1, Celular o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class TreeSetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123","Lenovo Notebook", 3500.00,0);
        Produto produto2 = new Produto("321","Picanha", 20.00,1);
        Produto produto3 = new Produto("879","Teclado Razer", 1000.00,0);
        Produto produto4 = new Produto("012","Samsung S7", 3450.00,1);
        Produto produto5 = new Produto("012","Samsung S7", 3450.00,1);
        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);
        produtoNavigableSet.add(produto5);

        for (Produto produto : produtoNavigableSet){
            System.out.println(produto);
        }
        System.out.println("----------------");
        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println(produtoNavigableSet.size());
        System.out.println(produtoNavigableSet.pollFirst());
        System.out.println(produtoNavigableSet.size());

    }
}
