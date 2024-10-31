package notadevenda;

public class NotaVendaApp {
    public static void main(String[] args) {
        Venda venda = new Venda();
        
        venda.adicionarProduto("Arroz", 5.50, 2);
        venda.adicionarProduto("Feijão", 7.20, 1);
        venda.adicionarProduto("Macarrão", 3.80, 3);
        venda.adicionarProduto("Óleo", 6.00, 1);

        venda.exibirNota();
    }
}
