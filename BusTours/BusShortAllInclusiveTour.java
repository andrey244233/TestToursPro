package BusTours;

import AirplainTours.AirplainShortAllInclusiveTour;


public class BusShortAllInclusiveTour extends AirplainShortAllInclusiveTour {

    public BusShortAllInclusiveTour(int number) {
        super(number);
        setTransport("Bus");
        setFood("All inclusive");
        setDays(7);
    }
}
