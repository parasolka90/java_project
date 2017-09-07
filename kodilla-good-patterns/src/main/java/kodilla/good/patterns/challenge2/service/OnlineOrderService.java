package kodilla.good.patterns.challenge2.service;
import kodilla.good.patterns.challenge2.order.ShopOrderRequest;
public class OnlineOrderService implements OrderService {
    @Override
    public boolean placeOrder(ShopOrderRequest shopOrderRequest) {
        if(shopOrderRequest.getShop().getName().equals("HealthyFoodShop")
                ||shopOrderRequest.getShop().getName().equals("GlutenFreeShop")
                ||shopOrderRequest.getShop().getName().equals("ExtraFoodShop")) {

            System.out.println("\nYour order has been placed successfully. Ordered items: "
                    + shopOrderRequest.getShopOrder().getOrderType()
                    + " " + shopOrderRequest.getShopOrder().getOrderQuantity());

            return true;
        }

        System.out.println("Ups sth went wrong :(!");
        return false;
    }
}
