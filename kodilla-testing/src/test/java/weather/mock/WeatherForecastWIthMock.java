package weather.mock;
import com.kodilla.spring.testing.weather.stub.Temperatures;
import com.kodilla.spring.testing.weather.stub.WeatherForecast;
import org.junit.*;

import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastWIthMock {
    @Test
    public void testCalculateForecastWithMock(){
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        HashMap<Integer,Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put(0,25.5);
        temperaturesMap.put(1,26.2);
        temperaturesMap.put(2,23.5);
        temperaturesMap.put(3,25.2);
        temperaturesMap.put(4,26.8);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assert.assertEquals(5,quantityOfSensors);
    }
}
