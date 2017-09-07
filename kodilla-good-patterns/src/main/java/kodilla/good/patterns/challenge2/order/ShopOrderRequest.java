package kodilla.good.patterns.challenge2.order;

import kodilla.good.patterns.challenge2.user.User;
import kodilla.good.patterns.challenge2.shop.Shop;

public class ShopOrderRequest {
    private User user;
    private Shop shop;
    private ShopOrder shopOrder;

    public ShopOrderRequest(User user, Shop shop, ShopOrder shopOrder) {
        this.user = user;
        this.shop = shop;
        this.shopOrder = shopOrder;
    }

    public User getUser() {
        return user;
    }

    public Shop getShop() {
        return shop;
    }

    public ShopOrder getShopOrder() {
        return shopOrder;
    }
}
