package kodilla.good.patterns.challenge2;

import kodilla.good.patterns.challenge2.order.ShopOrderProcessor;
import kodilla.good.patterns.challenge2.order.ShopOrderRequest;
import kodilla.good.patterns.challenge2.order.ShopOrderRequestRetriever;
import kodilla.good.patterns.challenge2.service.MailService;
import kodilla.good.patterns.challenge2.service.OnlineOrderRepository;
import kodilla.good.patterns.challenge2.service.OnlineOrderService;

public class Main {
    public static void main(String[]args) {
        ShopOrderRequestRetriever retriever = new ShopOrderRequestRetriever();
        ShopOrderRequest request1 = retriever.retrieve();

        ShopOrderProcessor processor = new ShopOrderProcessor(new OnlineOrderService(),
                new OnlineOrderRepository(),new MailService());
        processor.process(request1);
    }
}
