package kodilla.good.patterns.challenge3.airport;

import java.util.ArrayList;

public class Airport {
    String airport;
    ArrayList<String> directions;

    public Airport(String airport, ArrayList<String> directions) {
        this.airport = airport;
        this.directions = directions;
    }

    public String getAirport() {
        return airport;
    }

    public ArrayList<String> getDirections() {
        return directions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        String airport1 = (String) o;

        return this.airport == airport1;
    }

    @Override
    public int hashCode() {
        return airport.hashCode();
    }

    @Override
    public String toString() {
        return airport;
    }
}
