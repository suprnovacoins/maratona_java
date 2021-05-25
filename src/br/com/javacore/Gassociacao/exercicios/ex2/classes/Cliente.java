package br.com.javacore.Gassociacao.exercicios.ex2.classes;

public class Cliente {
    private String id;

    public Cliente() {
    }

    public Cliente(String nome) {
        this.id = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
