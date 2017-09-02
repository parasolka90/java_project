package kodilla.good.patterns.challange1.product;

import java.time.LocalDate;

public class Product {
    private String product;
    private double price;

    public Product(String product, double price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  product+" (price: "+price+" GBP)";
    }
}
