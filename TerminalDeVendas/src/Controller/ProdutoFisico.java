package Controller;

public class ProdutoFisico extends Produto {
    private double peso;

    public ProdutoFisico(String nome, int quantidade, double preco, double peso){
        super(nome, quantidade, preco);
        this.peso = peso;
    }

    @Override
    public String toString(){
         return "\n----Entidades.Produto----"+ "\nID: " + getIdFormatado()
                 +"\nNome: " + getNome()
                 + "\nQuantidade: " + getQuantidade()
                 +"\nPreço: " + getNumFormatado()
                 +"\nPeso: " + peso
                 +"\n-------------------\n";
    }

}
