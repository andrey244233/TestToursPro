package BusTours;

import AirplainTours.AirplainShortAllInclusiveTour;


public class BusShortAllInclusiveTour extends AirplainShortAllInclusiveTour {

//    public String typeName;
//    public String transport = "Bus";

    public BusShortAllInclusiveTour(String name, int number){
        super(name, number);
//        transport = "Bus";
//        food = "All inclusive";
//        days = 7;

        setTransport("Bus");
        setFood("All inclusive");
        setDays(7);
    }
}
