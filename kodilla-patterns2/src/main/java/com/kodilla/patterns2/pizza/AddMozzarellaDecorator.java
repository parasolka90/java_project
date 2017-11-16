package com.kodilla.patterns2.pizza;

import java.math.BigDecimal;

public class AddMozzarellaDecorator extends AbstractPizzaOrderDecorator {
    public AddMozzarellaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " buffalo mozzarella";
    }
}
