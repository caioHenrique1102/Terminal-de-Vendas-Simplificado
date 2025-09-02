package Model;

import Controller.MetodoPagamento;

public class Pagamento implements MetodoPagamento {
    private double valorPagamento;
    private double desconto;

    public Pagamento(double valorPagamento){
        this.valorPagamento = valorPagamento;
        this.desconto = 0.015;
    }

    public boolean ProcessarPagamento(){
        if(){

        }
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public double getDesconto() {
        return desconto;
    }
}
