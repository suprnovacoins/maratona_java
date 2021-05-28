package br.com.javacore.Npolimorfismo.test;

import br.com.javacore.Npolimorfismo.classes.ArquivoDAOImpl;
import br.com.javacore.Npolimorfismo.classes.GenericDAO;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arqDAO = new ArquivoDAOImpl();
        arqDAO.save();
    }
}
