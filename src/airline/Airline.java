package airline;

import airline.types.Aircraft;
import airline.types.AircraftCompare;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private final String airlineName;
    private final List<Aircraft> aircrafts = new ArrayList<>();

    public Airline(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public void calculateTotalCargoPassengerCapacity() {
        int totalPassengerCapacity = 0;
        int totalCargoCapacity = 0;
        for (Aircraft aircraft : aircrafts) {
            totalPassengerCapacity += aircraft.getSeatingCapacity();
            totalCargoCapacity += aircraft.getCargoCapacity();
        }

        System.out.println("Общая пассажировместимость: " + totalPassengerCapacity + " мест");
        System.out.println("Общая грузоподъёмность: " + totalCargoCapacity + " кг");
    }

    public void sortByFlightRange() {
        this.aircrafts.sort(new AircraftCompare());
    }

    public void sortByFuelConsumption(int min, int max, boolean showResult) {
        ArrayList<Aircraft> resultList = new ArrayList<>();
        for (Aircraft aircraft : this.aircrafts) {
            int planeConsumption = aircraft.getFuelConsumption();
            if (planeConsumption >= min && planeConsumption <= max) {
                resultList.add(aircraft);
            }
        }

        if (showResult) {
            showAircraftList(resultList);
        }
    }

    public void showAirlineAircrafts() {
        showAircraftList(this.aircrafts);
    }

    private void showAircraftList(List<Aircraft> al) {
        System.out.println("*** " + this.getAirlineName() + " ***");
        for (Aircraft aircraft : al) {
            System.out.println(aircraft);
        }
    }
}

