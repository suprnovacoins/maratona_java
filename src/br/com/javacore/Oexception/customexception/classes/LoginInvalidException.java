package br.com.javacore.Oexception.customexception.classes;

public class LoginInvalidException extends Exception {
    public LoginInvalidException() {
        super("Usuario ou senha invalido");
    }
}
