package br.com.javacore.Zcolecoes.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Isaias");
        nomes.add("Anjos");
        nomes.add("DevDojo");
        nomes.add("Aline");
        nomes.add("Clara");
        nomes.add(0,"Anna");
        Collections.sort(nomes);

        List<Double> numeros = new ArrayList<>();
        numeros.add(1.5);
        numeros.add(1.3);
        numeros.add(1.9);
        numeros.add(2d);
        Collections.sort(numeros);

        for (String nome : nomes){
            System.out.println(nome);
        }
        for (Double numero : numeros){
            System.out.println(numero);
        }

    }
}
