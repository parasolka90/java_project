package com.kodilla.patterns2.decorator;

import com.kodilla.patterns2.pizza.AddMozzarellaDecorator;
import com.kodilla.patterns2.pizza.AddProsciuttoDecorator;
import com.kodilla.patterns2.pizza.BasicPizzaOrder;
import com.kodilla.patterns2.pizza.PizzaOrder;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal pizzaCost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(15), pizzaCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String description = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals("Order a pizza", description);
    }

    @Test
    public void testPizzaMozzarellaAndProsciutto() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AddProsciuttoDecorator(pizzaOrder);
        pizzaOrder = new AddMozzarellaDecorator(pizzaOrder);
        //When
        BigDecimal pizzaCost = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(22), pizzaCost);
    }

    @Test
    public void testPizzaWithMozzarellaAndProsciuttoDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new AddMozzarellaDecorator(pizzaOrder);
        pizzaOrder = new AddProsciuttoDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        Assert.assertEquals("Order a pizza with buffalo mozzarella and prosciutto cotto", description);
    }

}
