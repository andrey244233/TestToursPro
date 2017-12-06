package AirplainTours;


public class AirplainShortAllInclusiveTour extends GeneralTour {

    public AirplainShortAllInclusiveTour(int number) {
        setNumber(number);
        setTransport("Airplain");
        setFood("All inclusive");
        setDays(7);
    }

    @Override
    public void showFields() {
        System.out.println("Номер тура: " + getNumber());
        System.out.println("Тип тура: " + getTypeName());
        System.out.println("Длительность тура: " + getDays());
        System.out.println("Тип питания: " + getFood());
        System.out.println("Тип транспорта " + getTransport());
    }
}
