package kodilla.good.patterns.challange1.information;

import kodilla.good.patterns.challange1.User;

public class MailService implements InformationService {
    @Override
    public void informUser(User user) {
        System.out.println("Hi "+user+ " your order has been dispatched ");
    }

}
