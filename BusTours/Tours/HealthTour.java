package BusTours.Tours;

import AirplainTours.AirplainShortAllInclusiveTour;
import BusTours.BusShortAllInclusiveTour;

public class HealthTour extends BusShortAllInclusiveTour {

    private int procedures;

    public HealthTour(int number) {
        super(number);
        setTypeName("Лечебный тур");
        setNumber(number);
        setProcedures(10);
    }

    public int getProcedures() {
        return procedures;
    }

    public void setProcedures(int procedures) {
        this.procedures = procedures;
    }

    @Override
    public void showFields() {
        super.showFields();
        System.out.println("Количество процедур " + getProcedures());
    }
}