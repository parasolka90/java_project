package kodilla.good.patterns.challenge2.shop;

import kodilla.good.patterns.challenge2.order.ShopOrder;
import kodilla.good.patterns.challenge2.user.User;

public interface Shop {
    default String getName() {
        return getClass().getSimpleName();
    }

    void process(User customer, ShopOrder shopOrder);
}
