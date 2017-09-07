package kodilla.good.patterns.challenge3;

import kodilla.good.patterns.challenge3.flightSearch.FlightData;
import kodilla.good.patterns.challenge3.flightSearch.FlightSearch;

public class Main {
    public static void main(String[]args){
        FlightSearch flightSearch = new FlightSearch();
        flightSearch.searchFlightsFrom("Kraków");
        flightSearch.searchFlightsTo("Warszawa");
        flightSearch.searchFlight("Rzeszów","Wrocław");
    }
}
