package BusTours;


import AirplainTours.AirplainShortOnlyBreakfastTour;

public class BusShortOnlyBreakfastTour extends AirplainShortOnlyBreakfastTour {

//    public String typeName;
//    public String transport = "Bus";

    public BusShortOnlyBreakfastTour(String name, int number){
        super(name, number);
//        transport = "Bus";
//        food = "Only Breakfast";
//        days = 7;

        setTransport("Bus");
        setFood("Only Breakfast");
        setDays(7);
    }
}
