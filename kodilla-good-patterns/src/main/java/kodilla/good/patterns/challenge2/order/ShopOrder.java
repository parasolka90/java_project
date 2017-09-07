package kodilla.good.patterns.challenge2.order;

public class ShopOrder {
    private String orderType;
    private String orderQuantity;
    public ShopOrder(String orderType, String orderQuantity) {
        this.orderType = orderType;
        this.orderQuantity = orderQuantity;
    }
    public String getOrderType() {
        return orderType;
    }
    public String getOrderQuantity() {
        return orderQuantity;
    }
 }
