package notadevenda;

import java.util.ArrayList;
import java.util.List;

class Venda {
    private List<Product> products;

    public Venda() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalVenda() {
        double total = 0;
        for (Product product : products) {
            total += product.getTotalPrice();
        }
        return total;
    }

    public void printNota() {
        System.out.println("------------ NOTA DE VENDA ------------");
        System.out.println("Produto         Qtde    Preço   Total");
        System.out.println("---------------------------------------");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("---------------------------------------");
        System.out.printf("TOTAL DA VENDA: R$ %.2f%n", getTotalVenda());
    }
}