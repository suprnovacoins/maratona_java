package br.com.javacore.Zcolecoes.test;

import br.com.javacore.Zcolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("123","Lenovo Notebook", 3500.00,0);
        Produto produto2 = new Produto("321","Picanha", 20.00,1);
        Produto produto3 = new Produto("879","Teclado Razer", 1000.00,0);
        Produto produto4 = new Produto("012","Samsung S7", 3450.00,1);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        Iterator<Produto> produtoIterator = produtos.iterator();
        //hasNext(); //next();
        while (produtoIterator.hasNext()){
            if (produtoIterator.next().getQuantidade() == 0){
                produtoIterator.remove();
            }
        }
        System.out.println(produtos.size());
    }
}
