package BusTours;

import AirplainTours.AirplainLongAllInclusiveTour;

public class BusLongAllInclusiveTour extends AirplainLongAllInclusiveTour {

    public BusLongAllInclusiveTour(int number) {
        super(number);
        setTransport("Bus");
        setFood("All inclusive");
        setDays(10);
    }

}
