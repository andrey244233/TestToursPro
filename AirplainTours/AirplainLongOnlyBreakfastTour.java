package AirplainTours;


public class AirplainLongOnlyBreakfastTour extends GeneralTour {

    public AirplainLongOnlyBreakfastTour(String name, int number){

        setTypeName(name);
        setNumber(number);
        setTransport("Airplain");
        setFood("Only Breakfast");
        setDays(10);
    }


}
