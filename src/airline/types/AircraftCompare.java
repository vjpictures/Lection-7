package airline.types;

import java.util.Comparator;

public class AircraftCompare implements Comparator<Aircraft> {

    @Override
    public int compare(Aircraft range1, Aircraft range2) {
        return Integer.compare(range1.getFlightRange(), range2.getFlightRange());
    }
}


