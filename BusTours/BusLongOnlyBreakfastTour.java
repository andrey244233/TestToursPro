package BusTours;

import AirplainTours.AirplainLongOnlyBreakfastTour;

public class BusLongOnlyBreakfastTour extends AirplainLongOnlyBreakfastTour {

    public BusLongOnlyBreakfastTour(int number) {
        super(number);
        setTransport("Bus");
        setFood("Only Breakfast");
        setDays(10);
    }
}
