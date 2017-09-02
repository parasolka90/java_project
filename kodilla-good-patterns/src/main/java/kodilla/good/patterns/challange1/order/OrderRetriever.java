package kodilla.good.patterns.challange1.order;

import kodilla.good.patterns.challange1.User;
import kodilla.good.patterns.challange1.product.Product;

import java.time.LocalDate;

public class OrderRetriever {
    public OrderRequest retrieve() {
        User user = new User("parasolka");
        Order order = new Order(new Product("Star Wars Rouge One", 156.85));
        LocalDate orderDate = LocalDate.of(2017, 9, 2);
        return new OrderRequest(order,user,order.getProduct(),orderDate);
    }

}
