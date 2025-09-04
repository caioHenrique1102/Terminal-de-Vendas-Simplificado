package Model;
import Controller.Produto;
import Controller.ProdutoFisico;


import java.util.HashMap;

public class ControleEstoque {
    private ProdutoFisico produto;
    HashMap<String, Produto> estoque;


    public ControleEstoque(){
        this.estoque = new HashMap<>();
    }

    public void CadastrarProduto(String nome, ProdutoFisico produto){
        if(estoque.containsKey(nome)){
           estoque.put(nome,produto);
        }
    }

    public void AlterarProduto(String nome,double valor){
        if(estoque.containsKey(nome)){
            produto.setPreco(valor);
        }else{
            System.err.println("Produto não cadastrado!!");
        }
    }

    public void EntradaProduto(String nome, int quantidade){
        int novaQuantidade = 0;
        if(estoque.containsKey(nome)){
            novaQuantidade = produto.getQuantidade() + quantidade;
            produto.setQuantidade(novaQuantidade);
        }else{
            System.err.println("Erro, produto não cadastrado!!!");
        }

    }

    public void ListarProdutos(){
        for(Produto produto : estoque.values()){
            System.out.println(produto.toString());
        }
    }



}
