package Model;
import Controller.ProdutoFisico;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class Vendas {
    List<ProdutoFisico> carrinho;
    private ControleEstoque controleEstoque;
    private ProdutoFisico produto;
    private double somaProdutos;
    private Pagamento pagamento;
    String numFormatado;
    DecimalFormat df = new DecimalFormat("#,##0.00");

    public Vendas() {
        this.carrinho = new ArrayList<>();
        this.somaProdutos = 0;
    }



    public void Venda(String nome, int quantidade) {
        if (controleEstoque.estoque.containsKey(nome)) {
            if (produto.getQuantidade() >= quantidade) {
                carrinho.add(produto);
                for(ProdutoFisico produto : carrinho){
                    somaProdutos = somaProdutos + produto.getPreco();
                }
                    numFormatado = df.format(somaProdutos);
                System.out.println("Valor total dos produtos no carrinho é de R$ " + numFormatado);
            }else {
                System.err.println("Quantidade do produto indisponivel");
            }
        } else {
            System.err.println("Error, não temos esse produto no estoque");
        }

    }
    public double getSomaProdutos() {
        return somaProdutos;
    }
}
