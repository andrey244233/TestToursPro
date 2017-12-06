package AirplainTours;


public class AirplainLongAllInclusiveTour extends GeneralTour {

    //public String typeName;
    //int number;
    //public String transport = "Airplain";
    //public String food = "All inclusive";
    //public int days = 10;


    public AirplainLongAllInclusiveTour(String name, int number) {
//        this.typeName = name;
//        this.number = number;
//        transport = "Airplain";
//        food = "All inclusive";
//        days = 10;
        setTypeName(name);
        setNumber(number);
        setTransport("Airplain");
        setFood("All inclusive");
        setDays(10);

    }



}
