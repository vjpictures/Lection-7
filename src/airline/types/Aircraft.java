package airline.types;

public abstract class Aircraft {
    private final String typesOfAircraft;
    private final String aircraftModel;
    private final int flightRange;
    private final int fuelConsumption;

    public Aircraft(int flightRange, int fuelConsumption, String typesOfAircraft, String aircraftModel) {
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
        this.typesOfAircraft = typesOfAircraft;
        this.aircraftModel = aircraftModel;
    }

    public abstract int getSeatingCapacity();

    public abstract int getCargoCapacity();

    public int getFlightRange() {
        return flightRange;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public String toString() {
        return "Вид летательного средства: " + typesOfAircraft
                + ", Модель: " + aircraftModel + ", Пассажировместимость: "
                + getSeatingCapacity() + " кресел, Грузоподъемность: " + getCargoCapacity()
                + " кг, Дальность полёта: " + flightRange + " км, Расход топлива: "
                + fuelConsumption + " л/ч";
    }
}


