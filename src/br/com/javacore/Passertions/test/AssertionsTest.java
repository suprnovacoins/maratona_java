package br.com.javacore.Passertions.test;

public class AssertionsTest {
    public static void main(String[] args) {
//        calcularSalario(-1000);
        diaSemana(8);
    }

    private static void calcularSalario(double salario){
        assert (salario > 0): " O salario nao deve ser menor do que zero, valor informado: "+salario;
        //fazer calculo com salario
    }
    private static void diaSemana(int dia){
        switch (dia){
            case 1:break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            default: assert false;
        }
    }
}
