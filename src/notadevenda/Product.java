package notadevenda;

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double unitPrice;
    private int quantitySold;

    public Product(String name, double unitPrice, int quantitySold) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantitySold = quantitySold;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public double getTotalPrice() {
        return unitPrice * quantitySold;
    }

    @Override
    public String toString() {
        return String.format("%-15s %5d x %7.2f = %7.2f", name, quantitySold, unitPrice, getTotalPrice());
    }
}
