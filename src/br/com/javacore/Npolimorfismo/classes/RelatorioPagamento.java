package br.com.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {

    public void relatorioPagamentoGerente(Gerente gerente){
        System.out.println("Gerando relatorio de pagamento para genrencia");
        gerente.calculaPagamento();
        System.out.println("Nome: "+ gerente.getNome());
        System.out.println("Salario desse mes: "+ gerente.getSalario());
    }
    public void relatorioPagamentoVendedor(Vendedor vendedor){
        System.out.println("Gerando relatorio de pagamento dos vendedores");
        vendedor.calculaPagamento();
        System.out.println("Nome: "+ vendedor.getNome());
        System.out.println("Salario desse mes: "+ vendedor.getSalario());
    }

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Gerando relatorio de pagamento");
        funcionario.calculaPagamento();
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Salario mês: "+funcionario.getSalario());
    }
}
