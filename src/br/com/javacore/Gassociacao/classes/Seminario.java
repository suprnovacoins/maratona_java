package br.com.javacore.Gassociacao.classes;

public class Seminario {
    private Professor professor;
    private Aluno[] alunos;
    private Local local;
    private String titulo;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print(){
        System.out.println("-----------------Relatorio de Seminários-----------------");
        System.out.println("Título: "+this.titulo);
        if(local != null) {
        System.out.println("Professor palestrante: "+this.getProfessor().getNome());
        }else{
            System.out.println("Nenhum professor cadastrado para este seminario");
        }
        if(local != null) {
            System.out.println("Local, rua: " + this.getLocal().getRua() + " ,bairro: " + this.getLocal().getBairro());
        }else{
            System.out.println("Nenhum local cadastrado para este seminario");
        }
        if(alunos != null && alunos.length != 0) {
            System.out.println("Alunos participantes: ");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome() + " ");
            }
            return;
        }
        System.out.println("Nenhum aluno cadastrado");
    }


    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Seminario(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
