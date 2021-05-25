package br.com.javacore.Aintroducaoclasses;

public class BibliotecaTest {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.nome = "Marcio";
        biblioteca.cpf = "123.456.789-50";
        biblioteca.rg = "12.034.383-5";
        biblioteca.matricula = 123451546;

        System.out.println("Nome: " + biblioteca.nome);
        System.out.println("RG: " + biblioteca.rg);
        System.out.println("CPF: " + biblioteca.cpf);
        System.out.println("Matricula: " + biblioteca.matricula);
    }
}
