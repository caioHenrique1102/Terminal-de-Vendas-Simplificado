package Estoque;
import Entidades.Produto;
import java.util.HashMap;

public class ControledeEstoque {
    private Produto produto;
    HashMap<String, Produto> estoque;

    public ControledeEstoque(){
        this.estoque = new HashMap<>();
    }
}
