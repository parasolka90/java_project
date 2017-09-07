package kodilla.good.patterns.challenge2.shop;

import kodilla.good.patterns.challenge2.order.ShopOrder;
import kodilla.good.patterns.challenge2.user.User;

public class ExtraFoodShop implements Shop {

    @Override
    public void process(User user, ShopOrder shopOrder) {
        System.out.println("Hi " + user.getUsername() + "! Good choice! You have ordered Extra Food Product: "
                + shopOrder.getOrderType() + ", " + shopOrder.getOrderQuantity());
    }
}
