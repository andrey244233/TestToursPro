package BusTours.Tours;

import AirplainTours.AirplainShortOnlyBreakfastTour;
import BusTours.BusLongOnlyBreakfastTour;

public class ExcursionTour extends BusLongOnlyBreakfastTour {

    private int freeExcursions;

    public ExcursionTour(int number) {
        super(number);
        setTypeName("Экскурсионный тур");
        setNumber(number);
        setFreeExcursions(3);
    }

    public int getFreeExcursions() {
        return freeExcursions;
    }

    public void setFreeExcursions(int freeExcursions) {
        this.freeExcursions = freeExcursions;
    }

    @Override
    public void showFields() {
        super.showFields();
        System.out.println("Бесплатные екскурсии " + getFreeExcursions());
    }
}
