package View;


import Model.Vendas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean vendasLoop = true;
        System.out.println("Olá seja bem-vindo!!!");

        System.out.println("----Produto---- ID: 001 Nome: Notebook Gamer Quantidade: 15 Preço: R$ 5.499,90\n" +
                "----Produto---- ID: 002 Nome: Cadeira de Escritório Ergonômica Quantidade: 32 Preço: R$ 899,00\n" +
                "----Produto---- ID: 003 Nome: Fone de Ouvido Bluetooth Quantidade: 112 Preço: R$ 249,50\n" +
                "----Produto---- ID: 004 Nome: Garrafa Térmica Inox 1L Quantidade: 250 Preço: R$ 89,99\n" +
                "----Produto---- ID: 005 Nome: Teclado Mecânico RGB Quantidade: 58 Preço: R$ 450,00\n" +
                "----Produto---- ID: 006 Nome: Livro \"O Guia do Mochileiro das Galáxias\" Quantidade: 89 Preço: R$ 42,70\n" +
                "----Produto---- ID: 007 Nome: Kit de Ferramentas com 120 Peças Quantidade: 25 Preço: R$ 320,00");

        System.out.println("\n-----Menu Principal-----"
                        +"Digite"
                        +"\n1. Iniciar nova venda:"
                        +"\n2. Gerenciar produtos:"
                        +"\n3. Sair");
        int resposta = scan.nextInt();
        scan.nextLine();
        if(resposta == 1){
        while(vendasLoop){
            Vendas vendas = new Vendas();
            System.out.println("----Menu de Vendas----" +
                     "Digite:"+
                    "\n1. Adicionar Produto ao Carrinho\n" +
                    "2. Ver Carrinho e Total\n" +
                    "3. Aplicar Desconto\n" +
                    "4. Finalizar Venda (Ir para Pagamento)\n" +
                    "5. Cancelar Venda\n");
            int repostaVenda = scan.nextInt();
            scan.nextLine();

            switch (repostaVenda){
                case 1 -> System.out.println("Digite o nome do produto: ");
                String nomeProduto = scan.nextLine();
                System.out.println("Digite a quantidade do produto: ");
                int quantidade = scan.nextInt();
                scan.nextLine();
                vendas.VendaAdicionarCarrinho(nomeProduto, quantidade);
                case 2 -> vendas.ListaProdutos();
                          vendas.TotalCarrinho();
                case 3 ->
                case 4 ->
                case 5 ->

            }

        }

        }






    }
}