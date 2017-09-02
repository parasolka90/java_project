package kodilla.good.patterns.challange1.order;

import kodilla.good.patterns.challange1.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CreatedOrderRepository implements OrderRepository{
    @Override
    public boolean createOrder(User user, Order order, LocalDate orderDate) {
        System.out.println("User " + user + " has ordered " + order + ". Order Date: " + orderDate);
        return true;
    }
}