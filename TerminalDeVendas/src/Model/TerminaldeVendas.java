package Model;
import Controller.Produto;

import java.util.HashMap;

public class TerminaldeVendas {
    private Produto produto;
    HashMap<String, Produto> estoque;
    HashMap<String,Integer> carrinho;

    public TerminaldeVendas(){
        this.estoque = new HashMap<>();
        this.carrinho = new HashMap<>();
    }

    public void CadastrarProduto(String nome, Produto produto){
        if(estoque.containsKey(nome)){
           estoque.put(nome,produto);
        }
    }

    public void Venda(String nome, int quantidade){
        if(estoque.containsKey(nome)){
            carrinho.put(nome,quantidade);
        }
    }
}
