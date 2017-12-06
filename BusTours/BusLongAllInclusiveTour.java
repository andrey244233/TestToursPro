package BusTours;

import AirplainTours.AirplainLongAllInclusiveTour;

public class BusLongAllInclusiveTour extends AirplainLongAllInclusiveTour {


    public BusLongAllInclusiveTour(String name, int number){
        super(name, number);
//        transport = "Bus";
//        food = "All inclusive";
//        days = 10;

        setTransport("Bus");
        setFood("All inclusive");
        setDays(10);
    }

}
