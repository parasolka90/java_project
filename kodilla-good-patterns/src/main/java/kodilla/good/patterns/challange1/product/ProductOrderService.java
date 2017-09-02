package kodilla.good.patterns.challange1.product;

        import kodilla.good.patterns.challange1.information.InformationService;
        import kodilla.good.patterns.challange1.order.OrderDto;
        import kodilla.good.patterns.challange1.order.OrderRepository;
        import kodilla.good.patterns.challange1.order.OrderRequest;
        import kodilla.good.patterns.challange1.order.OrderService;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {

        boolean isOrdered = orderService.placeOrder(orderRequest.getOrder());

        if (isOrdered) {
            orderRepository.createOrder(orderRequest.getUser(),
                    orderRequest.getOrder(), orderRequest.getOrderDate());
            informationService.informUser(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), true);
        }
        return new OrderDto(orderRequest.getUser(), false);
    }
}
