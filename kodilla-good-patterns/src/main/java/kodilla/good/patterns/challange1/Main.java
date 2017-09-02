package kodilla.good.patterns.challange1;

import kodilla.good.patterns.challange1.information.MailService;
import kodilla.good.patterns.challange1.order.CreatedOrderRepository;
import kodilla.good.patterns.challange1.order.OrderRequest;
import kodilla.good.patterns.challange1.order.OrderRetriever;
import kodilla.good.patterns.challange1.order.PlacedOrderService;
import kodilla.good.patterns.challange1.product.ProductOrderService;

public class Main {
    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        OrderRequest orderRequest = orderRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new PlacedOrderService(),
                new CreatedOrderRepository());
        productOrderService.process(orderRequest);
    }

}
