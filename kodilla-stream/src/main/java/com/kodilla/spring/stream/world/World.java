package com.kodilla.spring.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {
    public Set<Continent> continents = new HashSet<>();

    public BigDecimal getPeopleQuantity(){
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum,current)->sum=sum.add(current));
    }
    public void addContinent(Continent continent){
        continents.add(continent);
    }
}
