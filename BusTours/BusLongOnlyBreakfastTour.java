package BusTours;

import AirplainTours.AirplainLongOnlyBreakfastTour;

public class BusLongOnlyBreakfastTour extends AirplainLongOnlyBreakfastTour {

//    public String typeName;
//    public String transport = "Bus";

    public BusLongOnlyBreakfastTour(String name, int number){
        super(name, number);
//        transport = "Bus";
//        food = "Only Breakfast";
//        days = 10;

        setTransport("Bus");
        setFood("Only Breakfast");
        setDays(10);
    }
}
