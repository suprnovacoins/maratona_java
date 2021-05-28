package br.com.javacore.Npolimorfismo.classes;

public class DataBaseDAOImpl implements GenericDAO{
    @Override
    public void save() {
        System.out.println("Salvando no banco de dados");
    }
}
