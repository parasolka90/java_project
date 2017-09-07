package kodilla.good.patterns.challenge2.shop;

import kodilla.good.patterns.challenge2.order.ShopOrder;
import kodilla.good.patterns.challenge2.user.User;

public class GlutenFreeShop implements Shop{
    @Override
    public void process(User user, ShopOrder shopOrder) {
        System.out.println("Hi " + user.getUsername() + ", you have ordered Gluteen Free Product: "
                + shopOrder.getOrderType() + ", " + shopOrder.getOrderQuantity());
            System.out.println("Your colon will be grateful :)");
    }
}
