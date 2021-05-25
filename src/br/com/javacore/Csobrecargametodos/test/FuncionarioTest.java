package br.com.javacore.Csobrecargametodos.test;

import br.com.javacore.Csobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Osvaldo Ramos","555.636.487-80",3000, "39.038.356-4");
        funcionario.imprime();

    }
}
