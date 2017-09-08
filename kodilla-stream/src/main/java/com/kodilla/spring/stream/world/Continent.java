package com.kodilla.spring.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {
    String continent;
    private  Set<Country> countries = new HashSet<>();

    public Continent(String continent) {
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continent='" + continent + '\'' +
                '}';
    }
    public void addCountry(Country country){
        countries.add(country);
    }
    public Set<Country>getCountries(){
        return countries;
    }
}
