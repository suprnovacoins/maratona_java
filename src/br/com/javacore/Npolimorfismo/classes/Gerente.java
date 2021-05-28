package br.com.javacore.Npolimorfismo.classes;

public class Gerente extends Funcionario{
    private double pnl;

    public Gerente() {
    }

    @Override
    public void calculaPagamento() {
        this.salario = this.salario + pnl;
    }

    public Gerente(String nome, double salario, double pnl) {
        super(nome, salario);
        this.pnl = pnl;
    }

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }
}
