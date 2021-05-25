package br.com.javacore.Gassociacao.exercicios.ex2.classes;

public class Pagamento {
    private TipoPagamento tipoPagamento;
    private double valor;

    public Pagamento() {
    }

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
