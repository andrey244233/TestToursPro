package AirplainTours.Tours;

import AirplainTours.AirplainLongAllInclusiveTour;

public class CruisTour extends AirplainLongAllInclusiveTour {

    private int freeCoctails;

    public CruisTour(int number) {
        super(number);
        setTypeName("Круизный Тур");
        setNumber(number);
        setFreeCoctails(2);
    }

    public int getFreeCoctails() {
        return freeCoctails;
    }

    public void setFreeCoctails(int freeCoctails) {
        this.freeCoctails = freeCoctails;
    }

    @Override
    public void showFields() {
        super.showFields();
        System.out.println("Бесплатные коктейли " + getFreeCoctails());
    }
}


