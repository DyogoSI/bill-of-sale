package notadevenda;

class Venda {
    private List<Product> products;

    public Venda() {
        this.products = new ArrayList<>();
    }

    public void adicionarProduto(String nome, double precoUnitario, int quantidade) {
        Product produto = new Product(nome, precoUnitario, quantidade);
        products.add(produto);
    }

    public double getTotalVenda() {
        double total = 0;
        for (Product product : products) {
            total += product.getTotalPrice();
        }
        return total;
    }

    public void exibirNota() {
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
