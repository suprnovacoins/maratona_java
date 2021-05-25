package br.com.javacore.Gassociacao.test;

import br.com.javacore.Gassociacao.classes.Aluno;
import br.com.javacore.Gassociacao.classes.Local;
import br.com.javacore.Gassociacao.classes.Professor;
import br.com.javacore.Gassociacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Isaias", 27);
        Aluno aluno2 = new Aluno("Bruna", 21);

        Seminario sem = new Seminario("Como ser um baita programador e ganhar muito dinheiro");
        Professor prof = new Professor("Yoda", "Usar a força para programar");
        Local local = new Local("Rua das baratas", "Capao");

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);

        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.setAlunos(new Aluno[]{aluno,aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[0] = sem;
        prof.setSeminario(semArray);

        sem.print();
        prof.print();
        local.print();
    }
}
