package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public abstract class AbstractPizzaOrderDecorator implements PizzaOrder {
    private final PizzaOrder pizzaOrder;

    protected AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public String getDescription() {
        return pizzaOrder.getDescription() + getDescConnector();
    }

    public String getDescConnector() {
        if (pizzaOrder.getDescription().equals("Order a pizza")) {
            return " with";
        } else {
            return " and";
        }
    }
}
