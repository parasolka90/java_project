package com.kodilla.spring.testing.weather.stub;

import java.util.HashMap;

public interface Temperatures {
    //first element of the map is an indentifier of weather station
    // second is temp in Celsius degree
    HashMap<Integer,Double> getTemperatures();
}
