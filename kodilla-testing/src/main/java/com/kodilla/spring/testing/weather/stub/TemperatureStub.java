package com.kodilla.spring.testing.weather.stub;

import java.util.HashMap;

public class TemperatureStub implements Temperatures{

    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer,Double> stubResult = new HashMap<>();
        //dummy data

        stubResult.put(0,25.5);
        stubResult.put(1,26.2);
        stubResult.put(2,23.5);
        stubResult.put(3,25.2);
        stubResult.put(4,26.8);

        return stubResult;
    }
}
