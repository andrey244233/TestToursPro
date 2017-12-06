
import AirplainTours.GeneralTour;

import java.util.ArrayList;
import java.util.List;

public class SortClass {

    Helper helper;
    List<GeneralTour> tours = new ArrayList<>();

    public SortClass(Helper helper) {
        this.helper = helper;
        this.tours = helper.tours;
    }

    public void sortByTransport() {
        ArrayList<GeneralTour> airplainTours = new ArrayList<>();
        ArrayList<GeneralTour> busTours = new ArrayList<>();
        for (int i = 0; i < tours.size(); i++) {
            if (helper.tours.get(i).getTransport().equals("Airplain")) {
                airplainTours.add(tours.get(i));
            } else {
                busTours.add(tours.get(i));
            }
        }
        helper.showAll(airplainTours);
        helper.showAll(busTours);
    }

    public void sortByDays() {
        ArrayList<GeneralTour> sevenDayTours = new ArrayList<>();
        ArrayList<GeneralTour> tenDaysTours = new ArrayList<>();
        for (int i = 0; i < tours.size(); i++) {
            if (tours.get(i).getDays() == 7) {
                sevenDayTours.add(tours.get(i));
            } else {
                tenDaysTours.add(tours.get(i));
            }
        }
        helper.showAll(sevenDayTours);
        helper.showAll(tenDaysTours);
    }

    public void sortByFood() {
        ArrayList<GeneralTour> allIncTours = new ArrayList<>();
        ArrayList<GeneralTour> onlyBreakfstTours = new ArrayList<>();
        for (int i = 0; i < tours.size(); i++) {
            if (tours.get(i).getFood().equals("All inclusive")) {
                allIncTours.add(tours.get(i));
            } else {
                onlyBreakfstTours.add(tours.get(i));
            }
        }
        helper.showAll(allIncTours);
        helper.showAll(onlyBreakfstTours);
    }

}

