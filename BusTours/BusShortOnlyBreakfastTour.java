package BusTours;


import AirplainTours.AirplainShortOnlyBreakfastTour;

public class BusShortOnlyBreakfastTour extends AirplainShortOnlyBreakfastTour {

    public BusShortOnlyBreakfastTour(int number) {
        super(number);
        setTransport("Bus");
        setFood("Only Breakfast");
        setDays(7);
    }
}
