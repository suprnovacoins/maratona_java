package br.com.javacore.Npolimorfismo.classes;

public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor() {
    }

    @Override
    public void calculaPagamento() {
        this.salario = this.salario + totalVendas * 0.05;
    }

    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
