package Model;
import Controller.ProdutoFisico;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class Vendas {
    List<ProdutoFisico> carrinho;
    private ControleEstoque controleEstoque;
    private ProdutoFisico produto;
    private final double desconto;
    private double somaProdutos;
    String TotalFormatado;
    DecimalFormat df = new DecimalFormat("#,##0.00");

    public Vendas() {
        this.carrinho = new ArrayList<>();
        this.somaProdutos = 0;
        this.desconto = 0.015;
    }



    public void VendaAdicionarCarrinho(String nome, int quantidade) {
        if (controleEstoque.estoque.containsKey(nome)) {
            if (produto.getQuantidade() >= quantidade) {
                carrinho.add(produto);
                for(ProdutoFisico produto : carrinho){
                    somaProdutos = somaProdutos + produto.getPreco();
                }
                TotalFormatado = df.format(somaProdutos);
            }else {
                System.err.println("Quantidade do produto indisponivel");
            }
        } else {
            System.err.println("Error, não temos esse produto no estoque");
        }

    }

        public double VendasDesconto(double valorTotal){
            double calcDesconto = valorTotal * desconto;

            return valorTotal - calcDesconto;

        }

    public void ListaProdutos(){
        for(ProdutoFisico produtoFisico : carrinho){
            System.out.println(produtoFisico.toString());
        }
    }

    public void TotalCarrinho(){
        System.out.println("-----Total Carrinho-----"
                +"R$ " + TotalFormatado
                +"------------------------------"  );
    }

    public double getSomaProdutos() {
        return somaProdutos;
    }
}
