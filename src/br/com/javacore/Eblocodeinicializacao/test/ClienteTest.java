package br.com.javacore.Eblocodeinicializacao.test;

import br.com.javacore.Eblocodeinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {

        Cliente c = new Cliente();
        System.out.println("Exibindo a qnatidade de parcelas possiveis ...");
        for(int parcela : c.getParcelas()){
            System.out.println(parcela + " ");
        }
    }
}
