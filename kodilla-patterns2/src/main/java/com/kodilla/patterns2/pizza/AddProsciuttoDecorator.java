package com.kodilla.patterns2.pizza;

import java.math.BigDecimal;

public class AddProsciuttoDecorator extends AbstractPizzaOrderDecorator {
    public AddProsciuttoDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " prosciutto crudo";
    }


}

