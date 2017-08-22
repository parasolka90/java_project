package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China",new BigDecimal("123456789123456789")));
        asia.addCountry(new Country("Japan",new BigDecimal("23456789123456789")));
        asia.addCountry(new Country("India",new BigDecimal("3456789123456789")));
        world.addContinent(asia);
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Poland",new BigDecimal("789123456789")));
        europe.addCountry(new Country("Germany",new BigDecimal("456789123456789")));
        europe.addCountry(new Country("Russia",new BigDecimal("9123456789")));
        world.addContinent(europe);

        //When
       BigDecimal worldPopulation = world.getPeopleQuantity();
       //Then
        Assert.assertEquals(new BigDecimal("150827954740740734"),worldPopulation);

    }
}
