package br.com.javacore.ZZAgenerics.test;

import br.com.javacore.Zcolecoes.classes.Consumidor;

import java.util.ArrayList;
import java.util.List;

import static com.sun.javafx.fxml.expression.Expression.add;

public class GenericsTest {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Boku");
        lista.add("Nidoriya");

        for (String o: lista){
            System.out.println(o);
        }
        add(lista, new Consumidor("Midoriya","123456"));

        for (Object o: lista){
            System.out.println(o);
        }

    }

    private static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}
