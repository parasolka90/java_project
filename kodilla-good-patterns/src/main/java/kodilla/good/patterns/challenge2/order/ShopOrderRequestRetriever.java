package kodilla.good.patterns.challenge2.order;

import kodilla.good.patterns.challenge2.shop.ExtraFoodShop;
import kodilla.good.patterns.challenge2.shop.GlutenFreeShop;
import kodilla.good.patterns.challenge2.shop.HealthyFoodShop;
import kodilla.good.patterns.challenge2.shop.Shop;
import kodilla.good.patterns.challenge2.user.User;

public class ShopOrderRequestRetriever {
    public ShopOrderRequest retrieve() {

        User user = new User("parasolka", "Gdansk, adress xyz");
        ShopOrder shopOrder = new ShopOrder("foodproduct", "10kg");

        Shop shop = new GlutenFreeShop();
        shop.process(user, shopOrder);

        return new ShopOrderRequest(user, shop, shopOrder);
    }
}
