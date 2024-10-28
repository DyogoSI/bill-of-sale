package notadevenda;

public class NotaVendaApp {
    public static void main(String[] args) {
        Venda venda = new Venda();
        
        // Adicionar produtos
        venda.addProduct(new Product("Arroz", 5.50, 2));
        venda.addProduct(new Product("Feijão", 7.20, 1));
        venda.addProduct(new Product("Macarrão", 3.80, 3));
        venda.addProduct(new Product("Óleo", 6.00, 1));

        // Exibir nota de venda
        venda.printNota();
    }
}
