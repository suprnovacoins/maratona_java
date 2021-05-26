package br.com.javacore.Lclassesabstratas.test;

import br.com.javacore.Lclassesabstratas.classes.Funcionario;
import br.com.javacore.Lclassesabstratas.classes.Gerente;
import br.com.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Ana","52661-7",2000);
        Vendedor v = new Vendedor("Bruno", "66987-5",1500,5000);
        System.out.println("-------Gerente-------");
        g.calculaSalario();
        System.out.println(g);
        System.out.println("-------Vendedor-------");
        v.calculaSalario();
        System.out.println(v);



    }
}
