package br.com.javacore.Zcolecoes.test;

import br.com.javacore.Zcolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortProdutoTest {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("123","Lenovo Notebook", 3500.00);
        Produto produto2 = new Produto("321","Picanha", 20.00);
        Produto produto3 = new Produto("879","Teclado Razer", 1000.00);
        Produto produto4 = new Produto("012","Samsung S7", 3450.00);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        Collections.sort(produtos);
        for (Produto produto : produtos){
            System.out.println(produto);
        }
    }
}
