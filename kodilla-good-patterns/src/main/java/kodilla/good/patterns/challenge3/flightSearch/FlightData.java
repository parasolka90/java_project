package kodilla.good.patterns.challenge3.flightSearch;

import kodilla.good.patterns.challenge3.airport.Airport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class FlightData {
    HashSet<Airport> flightData = new HashSet<>();
    public FlightData() {
        Airport airport1 = new Airport("Katowice", new ArrayList<>(Arrays.asList("Gdańsk", "Warszawa", "Wrocław")));
        Airport airport2 = new Airport("Kraków", new ArrayList<>(Arrays.asList("Warszawa", "Wrocław")));
        Airport airport3 = new Airport("Rzeszów", new ArrayList<>(Arrays.asList("Katowice", "Warszawa", "Poznań")));

        flightData.add(airport1);
        flightData.add(airport2);
        flightData.add(airport3);
    }
    Airport getEqual(String departure) {
        for (Airport one : this.flightData) {
            if (one.equals(departure)) {
                return one;
            }
        }
        return new Airport("",new ArrayList<>());
    }

}
