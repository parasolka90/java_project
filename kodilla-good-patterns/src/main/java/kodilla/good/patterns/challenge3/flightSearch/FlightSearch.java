package kodilla.good.patterns.challenge3.flightSearch;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FlightSearch {
    FlightData flightsData;

    public FlightSearch() {
        this.flightsData = new FlightData();
    }

    public void searchFlightsFrom(String departure){
        ArrayList<String> directionsList =(flightsData.getEqual(departure).getDirections());

        System.out.println(directionsList);
    }
    public void searchFlightsTo(String arrival) {
        System.out.println(flightsData.flightData.stream().filter(e->e.getDirections().contains(arrival)).collect(Collectors.toList()));

    }
    public void searchFlight(String departure, String arrival){
        ArrayList<String> directionsList =(flightsData.getEqual(departure).getDirections());
        if(directionsList.contains(arrival)){
            System.out.println("Direct flight has been found.");

        }
        ArrayList<String> arrayList = new ArrayList<>();
        directionsList.stream().forEach(e->flightsData.getEqual(e).getDirections().stream().filter(a->a==arrival)
                .map(l->e).forEach(arrayList::add));
        System.out.println("Indirect flight has been found through: " +arrayList);
    }

}
