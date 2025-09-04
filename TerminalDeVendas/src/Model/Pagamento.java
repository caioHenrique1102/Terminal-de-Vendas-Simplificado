package Model;

import Controller.MetodoPagamento;


public class Pagamento implements MetodoPagamento {
    private ControleEstoque controleEstoque;
    private Vendas vendas;


    public Pagamento(double valorPagamento){
        this.valorPagamento = valorPagamento;
        this.desconto = 0.015;
    }


    public double getValorPagamento() {
        return valorPagamento;
    }

    public double getDesconto() {
        return desconto;
    }

    public boolean ProcessarPagamento(){
        if(){

        }
    }


    public double PagamentoDinheiro(double valor){
        if(){

        }
    }
}
