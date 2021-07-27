package br.com.javacore.Zcolecoes.test;

import br.com.javacore.Zcolecoes.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTest {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Galaxy S20", "123456");
        Celular celular2 = new Celular("Galaxy S10", "955562");
        Celular celular3 = new Celular("iPhone 4", "12345778");
        List<Celular> celularList = new ArrayList<>();
        celularList.add(celular1);
        celularList.add(celular2);
        celularList.add(celular3);

        for(Celular celular : celularList){
            System.out.println(celular);
        }
        Celular celular4 = new Celular("iPhone 4", "12345778");
        System.out.println(celularList.contains(celular4));
    }
}
