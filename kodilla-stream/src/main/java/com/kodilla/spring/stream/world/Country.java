package com.kodilla.spring.stream.world;

import java.math.BigDecimal;

public class Country {
    String country;
    BigDecimal population;

    public Country(String country, BigDecimal population) {
        this.country = country;
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public BigDecimal getPeopleQuantity() {
        return population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", population=" + population +
                '}';
    }
}
