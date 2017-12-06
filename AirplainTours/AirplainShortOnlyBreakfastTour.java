package AirplainTours;


public class AirplainShortOnlyBreakfastTour extends GeneralTour {

    public AirplainShortOnlyBreakfastTour(int number) {
        setNumber(number);
        setTransport("Airplain");
        setFood("Only Breakfast");
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
