package kodilla.good.patterns.challange1.order;

import kodilla.good.patterns.challange1.User;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface OrderRepository {

        boolean createOrder(User user, Order order, LocalDate orderDate);
}
