package AirplainTours;


public class AirplainShortOnlyBreakfastTour extends GeneralTour {

    public AirplainShortOnlyBreakfastTour(String name, int number) {
//        this.typeName = name;
//        this.number = number;
//        transport = "Airplain";
//        food = "Only Breakfast";
//        days = 7;

        setTypeName(name);
        setNumber(number);
        setTransport("Airplain");
        setFood("Only Breakfast");
        setDays(7);
    }

}
