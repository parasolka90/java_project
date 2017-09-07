package kodilla.good.patterns.challenge2.service;

import kodilla.good.patterns.challenge2.order.ShopOrderRequest;

public class MailService implements InformationService {
    @Override
    public void sendInformation(ShopOrderRequest shopOrderRequest) {
        System.out.println("Hi  " + shopOrderRequest.getUser().getUsername()
                + " your order has been dispatched.");
    }
}
