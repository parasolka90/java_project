package kodilla.good.patterns.challenge2.service;

import kodilla.good.patterns.challenge2.order.ShopOrderRequest;

public interface OrderRepository {
    void createOrder(ShopOrderRequest shopOrderRequest);
}
