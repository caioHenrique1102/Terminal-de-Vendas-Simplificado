package Model;

import Controller.ProdutoFisico;


import java.util.HashMap;

public class ControleEstoque {
    private ProdutoFisico produto;
    private Pagamento pagamento;
    HashMap<String, ProdutoFisico> estoque;


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
        int quantidadeEntrada = 0;
        if(estoque.containsKey(nome)){
            quantidadeEntrada = produto.getQuantidade() + quantidade;
            produto.setQuantidade(quantidadeEntrada);
        }else{
            System.err.println("Erro, produto não cadastrado!!!");
        }

    }


    public void SaidaProduto(String nome, int quantidade){
        int quantidadeSaida = 0;
        if(estoque.containsKey(nome)){
            if(quantidade <= produto.getQuantidade()){
            quantidadeSaida = produto.getQuantidade() - quantidadeSaida;
            produto.setQuantidade(quantidadeSaida);
            }else {
                System.err.println("Erro, quantidade solicitada maior que a quantidade em estoque!!!!");
            }
        }
    }

    public void ListarProdutos(){
        for(ProdutoFisico produto : estoque.values()){
            System.out.println(produto.toString());
        }
    }



}
