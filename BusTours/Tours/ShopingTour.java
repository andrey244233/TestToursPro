package BusTours.Tours;

import AirplainTours.AirplainShortOnlyBreakfastTour;
import BusTours.BusShortOnlyBreakfastTour;

public class ShopingTour extends BusShortOnlyBreakfastTour {

    private String timeForShoping;

    public ShopingTour(int number) {
        super(number);
        setTypeName("Шопинг тур");
        setNumber(number);
        setTimeForShoping("1h");
    }

    public String getTimeForShoping() {
        return timeForShoping;
    }

    public void setTimeForShoping(String timeForShoping) {
        this.timeForShoping = timeForShoping;
    }

    @Override
    public void showFields() {
        super.showFields();
        System.out.println("Время для шопинга в одном магазине " + getTimeForShoping());
    }
}
