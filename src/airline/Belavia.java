package airline;

import airline.types.Aircraft;
import airline.models.Boeing737;
import airline.models.DJIAIR3;
import airline.models.EmbraerE195;
import airline.models.Mi24;

public class Belavia {
    public static void main(String[] args) {
        Aircraft aircraftBoeing = new Boeing737();
        Aircraft aircraftEmbraer = new EmbraerE195();
        Aircraft helicopterMi = new Mi24();
        Aircraft quadcopterDji = new DJIAIR3();

        System.out.println("Все виды лётных средств авиакомпании");
        Airline belavia = new Airline("Belavia");

        belavia.addAircraft(aircraftBoeing);
        belavia.addAircraft(aircraftEmbraer);
        belavia.addAircraft(helicopterMi);
        belavia.addAircraft(quadcopterDji);

        belavia.showAirlineAircrafts();
        belavia.sortByFlightRange();
        System.out.println();
        System.out.println("Сортировка лётных средств авиакомпании по дальности полета: ");

        belavia.showAirlineAircrafts();
        System.out.println();

        System.out.println("Сортировка лётных средств авиакомпании по расходу топлива:");
        belavia.sortByFuelConsumption(2000, 3000, true);
        System.out.println();

        belavia.printTotalCargoPassengerCapacity();

    }
}

