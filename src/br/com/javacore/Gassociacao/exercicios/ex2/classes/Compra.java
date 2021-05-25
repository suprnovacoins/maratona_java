package br.com.javacore.Gassociacao.exercicios.ex2.classes;

public class Compra {
    private Pedido[] pedido;
    private Pagamento[] pagamentos;
    private double valorTotal;

    public Compra() {
    }

    public Compra(Pedido[] pedido, Pagamento[] pagamentos, double valorTotal) {
        this.pedido = pedido;
        this.pagamentos = pagamentos;
        this.valorTotal = valorTotal;
    }

    public Pedido[] getPedido() {
        return pedido;
    }

    public void realizarCompra(){

    }

    public void setPedido(Pedido[] pedido) {
        this.pedido = pedido;
    }

    public Pagamento[] getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(Pagamento[] pagamentos) {
        this.pagamentos = pagamentos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
