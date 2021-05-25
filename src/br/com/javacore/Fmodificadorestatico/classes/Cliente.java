package br.com.javacore.Fmodificadorestatico.classes;

public class Cliente {
    private static int[] parcelas;
    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicializacao");
        for (int i=1; i<=100;i++){
            parcelas[i-1] = i;
        }
    }

    public Cliente() {
    }

    public static int[] getParcelas() {
        return parcelas;
    }

}
