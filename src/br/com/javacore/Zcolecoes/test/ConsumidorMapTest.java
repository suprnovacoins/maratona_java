package br.com.javacore.Zcolecoes.test;

import br.com.javacore.Zcolecoes.classes.Consumidor;
import br.com.javacore.Zcolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Isaias", "122");
        Consumidor consumidor2 = new Consumidor("DevDojo", "321");
        Produto produto1 = new Produto("123","Lenovo Notebook", 3500.00,0);
        Produto produto2 = new Produto("321","Picanha", 20.00,1);
        Produto produto3 = new Produto("879","Teclado Razer", 1000.00,0);
        Produto produto4 = new Produto("012","Samsung S7", 3450.00,1);

        Map<Consumidor,List<Produto>> map = new HashMap<>();

        List<Produto> produtoCon1 = new ArrayList<>();
        produtoCon1.add(produto1);
        produtoCon1.add(produto2);
        List<Produto> produtoCon2 = new ArrayList<>();
        produtoCon2.add(produto3);
        produtoCon2.add(produto4);

        map.put(consumidor,produtoCon1);
        map.put(consumidor2,produtoCon2);
        for (Map.Entry<Consumidor, List<Produto>> entry : map.entrySet()){
            System.out.println(entry.getKey().getNome());
            for (Produto produto : entry.getValue()){
                System.out.println(produto.getNome());
            }
        }

    }
}
