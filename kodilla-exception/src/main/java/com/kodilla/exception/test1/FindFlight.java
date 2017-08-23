package com.kodilla.exception.test1;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    public boolean findFligt(Flight flight) throws RouteNoFoundException {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Liverpool", true);
        airports.put("Tokio", false);
        airports.put("Helsinki", true);

        if (airports.get(flight.getArrivalAirport())) {
            return true;
        } else {
            throw new RouteNoFoundException();
        }
    }

    public static void main(String[] args) {
        FindFlight findFlight = new FindFlight();
        try {
            Flight lol = new Flight("Warsaw", "Tokio");
            findFlight.findFligt(lol);
        } catch (RouteNoFoundException e) {
            System.out.println("Error:" + e);
        } finally {
            System.out.println("finally");
        }
    }
}
