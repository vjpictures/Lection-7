package airline.types;

public class Quadcopter extends Aircraft {
    private final Integer seatingCapacity;
    private final Integer cargoCapacity;

    public Quadcopter(int seatingCapacity, int cargoCapacity,
                      int flightRange, int fuelConsumption,
                      String typesOfAircraft, String aircraftModel) {
        super(flightRange, fuelConsumption, typesOfAircraft, aircraftModel);
        this.seatingCapacity = seatingCapacity;
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public int getCargoCapacity() {
        return cargoCapacity;
    }
}

