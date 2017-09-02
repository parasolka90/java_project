package kodilla.good.patterns.challange1.order;

import kodilla.good.patterns.challange1.User;
import kodilla.good.patterns.challange1.product.Product;

import java.time.LocalDate;

public class OrderRequest {
    private Order order;
    private User user;
    private Product product;
    private LocalDate orderDate;

    public OrderRequest(Order order, User user,Product product, LocalDate orderDate) {
        this.user=user;
        this.order = order;
        this.product = product;
        this.orderDate = orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getOrderDate() {

        return orderDate;
    }

    public Order getOrder() {
        return order;
    }
    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "order=" + order +
                ", user=" + user +
                ", product=" + product +
                ", orderDate=" + orderDate +
                '}';
    }
}


