package kodilla.good.patterns.challange1.order;

import kodilla.good.patterns.challange1.product.Product;

public class Order {
    private Product product;


    public Order(Product product) {
        this.product = product;

    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return  ""+product;
    }
}
