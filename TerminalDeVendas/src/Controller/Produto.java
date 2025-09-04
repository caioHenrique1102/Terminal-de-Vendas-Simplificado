package Controller;

import java.text.DecimalFormat;
import java.util.Random;

public abstract class Produto {
    private final long id;
    private final String nome;
    private int quantidade;
    private double preco;

    Random NewId = new Random();
    DecimalFormat df = new DecimalFormat("#,##0.00");
    String numFormatado;
    String idFormatado;
    public Produto(String nome, int quantidade, double preco ){
        this.preco = preco;
        this.nome = nome;
        this.quantidade = quantidade;
        this.id = NewId.nextInt(100);
        this.numFormatado = df.format(preco);
        this.idFormatado = Long.toString(id);

    }

    public String getNumFormatado(){
        return numFormatado;
    }

    public String getIdFormatado() { return idFormatado; }

    public long getId() {
        return this.id;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        if(quantidade >= 0){
        this.quantidade = quantidade;
        }else{
            System.err.println("Erro, o estoque do produto não pode ser negativo");
        }
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        if(preco >= 0) {
            this.preco = preco;
        }else {
            System.err.println("Erro, o preço do produto não pode ser negativo");
        }
    }
    @Override
    public String toString(){
        return "\n----Produto----"+
                "\nID: " + idFormatado
                +"\nNome: " + nome
                + "\nQuantidade: " + quantidade
                +"\nPreço: " + numFormatado
                +"\n-------------------\n";
    }


}
