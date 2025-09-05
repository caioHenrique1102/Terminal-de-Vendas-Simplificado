package Model;

import Controller.MetodoPagamento;

import java.text.DecimalFormat;


public class Pagamento implements MetodoPagamento {
    private ControleEstoque controleEstoque;
    private Vendas vendas;
    private double troco;
    DecimalFormat df = new DecimalFormat("#,##0.00");
    String numFormatado;

    public Pagamento(){

    }

    @Override
    public boolean ProcessarPagamento(double valor){
        boolean pagamentoAprovado;
        if(valor == vendas.getSomaProdutos()){
            pagamentoAprovado = true;
        }else {
            pagamentoAprovado = false;
        }
        return pagamentoAprovado;
    }


    public double PagamentoDinheiro(double valor){
        if(valor > vendas.getSomaProdutos()){
            troco = valor - vendas.getSomaProdutos();
            numFormatado = df.format(troco);
            System.out.println("Seu troco é de R$" + numFormatado);
        }else if(valor == vendas.getSomaProdutos()) {
            ProcessarPagamento(valor);
            System.out.println("Venda aprovada!!!");
        }else {
            System.err.println("Erro, valor insuficiente!!!");
        }

        return troco;
    }
}
