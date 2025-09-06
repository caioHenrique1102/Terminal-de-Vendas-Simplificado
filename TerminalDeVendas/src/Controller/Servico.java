package Controller;

public class Servico extends Produto {
    private final double duracaoemHoras;
    public Servico(String nome, int quantidade, double preco, double duracaoemHoras){
        super(nome, quantidade, preco);
        this.duracaoemHoras = duracaoemHoras;
    }

    @Override
    public String toString(){
        return "\n----Produto----"+ "\nID: " + getIdFormatado()
                +"\nNome: " + getNome()
                + "\nQuantidade: " + getQuantidade()
                +"\nPreço: " + getNumFormatado()
                +"\nDuração Horas: " + duracaoemHoras
                +"\n-------------------\n";
    }
}
