package br.com.javacore.Gassociacao.exercicios.ex2.classes;

public class Produto {
    private double peco;
    private int quantidade;

    public Produto() {
    }

    public Produto(double peco, int quantidade) {
        this.peco = peco;
        this.quantidade = quantidade;
    }

    public double getPeco() {
        return peco;
    }

    public void setPeco(double peco) {
        this.peco = peco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
