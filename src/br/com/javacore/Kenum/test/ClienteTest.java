package br.com.javacore.Kenum.test;

import br.com.javacore.Kenum.classes.Cliente;
import br.com.javacore.Kenum.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente("Ana", TipoCliente.PESSOA_FISICA);
        System.out.println(c);
    }
}
