package br.com.javacore.Hheranca.test;

import br.com.javacore.Hheranca.classes.Endereco;
import br.com.javacore.Hheranca.classes.Funcionario;
import br.com.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Gina");
//        p.setNome("Gina");
        p.setCpf("12345");
        Endereco end = new Endereco();
        end.setBairro("Bairro 3");
        end.setRua("Rua 25");
        p.setEndereco(end);
        p.print();

        System.out.println("---------------Funcionario---------------");
        Funcionario f = new Funcionario("Augusto");
//        f.setNome("Augusto");
        f.setCpf("1234567");
        f.setSalario(2000);
        f.setEndereco(end);
        f.print();

    }
}
