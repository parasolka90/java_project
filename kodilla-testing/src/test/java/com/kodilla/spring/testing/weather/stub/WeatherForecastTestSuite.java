package com.kodilla.spring.testing.weather.stub;

import org.junit.*;

public class WeatherForecastTestSuite {

    @Test
    public void testCalculateForcastWithStub(){
        //Given
        Temperatures temperatures = new TemperatureStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors= weatherForecast.calculateForecast().size();

        //Then
        Assert.assertEquals(5,quantityOfSensors);
    }
}
