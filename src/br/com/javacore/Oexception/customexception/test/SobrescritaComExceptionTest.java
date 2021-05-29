package br.com.javacore.Oexception.customexception.test;

import br.com.javacore.Oexception.customexception.classes.Funcionario;
import br.com.javacore.Oexception.customexception.classes.LoginInvalidException;
import br.com.javacore.Oexception.customexception.classes.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();

        try {
            f.salvar();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
