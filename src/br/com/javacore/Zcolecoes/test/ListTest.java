package br.com.javacore.Zcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList();
        List<String> nomes2 = new ArrayList();
        nomes.add("Isaias");
        nomes.add("devdojo");

        nomes2.add("Isaias2");
        nomes2.add("devdojo2");

        System.out.println("size: " + nomes.size());
        System.out.println(nomes.remove("devdojo"));
        System.out.println("size: " + nomes.size());
        nomes.addAll(nomes2);
        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(i);
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        for(Integer num : numeros){
            System.out.println(num);
        }
    }
}
