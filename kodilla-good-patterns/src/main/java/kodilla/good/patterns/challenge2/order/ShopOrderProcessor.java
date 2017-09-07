package kodilla.good.patterns.challenge2.order;

import kodilla.good.patterns.challenge2.service.InformationService;
import kodilla.good.patterns.challenge2.service.OrderRepository;
import kodilla.good.patterns.challenge2.service.OrderService;

public class ShopOrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ShopOrderProcessor(final OrderService orderService,
                              final OrderRepository orderRepository,
                              final InformationService informationService) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public boolean process(final ShopOrderRequest shopOrderRequest){

        boolean isOrdered = orderService.placeOrder(shopOrderRequest);

        if(isOrdered) {
            orderRepository.createOrder(shopOrderRequest);
            informationService.sendInformation(shopOrderRequest);
            return true;
        }
        return false;
    }
}
