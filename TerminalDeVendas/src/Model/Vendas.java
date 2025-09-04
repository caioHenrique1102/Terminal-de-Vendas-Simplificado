package Model;
import Controller.ProdutoFisico;
import java.util.ArrayList;
import java.util.List;


public class Vendas {
    List<ProdutoFisico> carrinho;
    private ControleEstoque controleEstoque;
    private ProdutoFisico produto;

    public Vendas() {
        this.carrinho = new ArrayList<>();
    }


    public void Venda(String nome, int quantidade) {
        double somaProdutos;
        if (controleEstoque.estoque.containsKey(nome)) {
            if (produto.getQuantidade() >= quantidade) {

                carrinho.add(produto);
            }else {
                System.err.println("Quantidade do produto indisponivel");
            }
        } else {
            System.err.println("Error, não temos esse produto no estoque");
        }


    }
}
