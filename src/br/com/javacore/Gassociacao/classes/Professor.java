package br.com.javacore.Gassociacao.classes;

public class Professor {
    private Seminario[] seminario;

    private String nome;
    private String especialidade;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void print() {
        System.out.println("-----------------Relatorio de Professores-----------------");
        System.out.println("Nome do Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if(seminario != null  && seminario.length != 0) {
            System.out.println("Seminarios participantes: ");
            for (Seminario sem : seminario) {
                System.out.println(sem.getTitulo() + " ");
            }
            return;
        }
        System.out.println("Professor nao vinculado a nenhum seminario!");
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
