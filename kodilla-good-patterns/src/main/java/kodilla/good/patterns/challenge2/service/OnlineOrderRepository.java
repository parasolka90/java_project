package kodilla.good.patterns.challenge2.service;

import kodilla.good.patterns.challenge2.order.ShopOrderRequest;

public class OnlineOrderRepository implements OrderRepository {
    @Override
    public void createOrder(ShopOrderRequest shopOrderRequest) {
        System.out.println("\nThe order has been placed: Shop: " + shopOrderRequest.getShop().getName() +
                "\nproduct: " + shopOrderRequest.getShopOrder().getOrderType()+
                "\nquantity: " + shopOrderRequest.getShopOrder().getOrderQuantity()+
                "\ndelivery adress: " + shopOrderRequest.getUser().getUsername()
                + ", " + shopOrderRequest.getUser().getAddress()+"\n");
    }
}
