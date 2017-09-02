package kodilla.good.patterns.challange1.order;

import kodilla.good.patterns.challange1.product.ProductAvailability;

public class PlacedOrderService implements OrderService {
    private ProductAvailability productAvailability = new ProductAvailability();
    @Override
    public boolean placeOrder(Order order) {
        if(productAvailability.isAvailable(order)){
            System.out.println("Your order has been processed successfully");
            return true;
        }
        return false;
    }
}
