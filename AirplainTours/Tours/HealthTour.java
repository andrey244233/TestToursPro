package AirplainTours.Tours;

import AirplainTours.AirplainShortAllInclusiveTour;

public class HealthTour extends AirplainShortAllInclusiveTour {

    private int procedures;

    public HealthTour(int number) {
        super( number);
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