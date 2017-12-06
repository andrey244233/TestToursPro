import AirplainTours.*;
import BusTours.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Helper {

    public String[] tourNames = {"Круизный тур", "Екскурсионный тур", "Лечебный тур", "Шопинг тур"};
    public List<GeneralTour> tours = new ArrayList<>();


    public void createAirplainTours() {
        int number = 1;
        for (int i = 0; i < tourNames.length; i++) {
            tours.add(new AirplainLongAllInclusiveTour(tourNames[i], number++));
            tours.add(new AirplainLongOnlyBreakfastTour(tourNames[i], number++));
            tours.add(new AirplainShortAllInclusiveTour(tourNames[i], number++));
            tours.add(new AirplainShortOnlyBreakfastTour(tourNames[i], number++));

            tours.add(new BusLongAllInclusiveTour(tourNames[i], number++));
            tours.add(new BusLongOnlyBreakfastTour(tourNames[i], number++));
            tours.add(new BusShortAllInclusiveTour(tourNames[i], number++));
            tours.add(new BusShortOnlyBreakfastTour(tourNames[i], number++));
        }
    }

    public void showAll(ArrayList<GeneralTour> currentTours) {
        for (int i = 0; i < currentTours.size(); i++) {
            GeneralTour currentTour = currentTours.get(i);
            System.out.println("Номер тура: " + currentTour.getNumber());
            System.out.println("Тип тура: " + currentTour.getTypeName());
            System.out.println("Длительность тура: " + currentTour.getDays());
            System.out.println("Тип питания: " + currentTour.getFood());
            System.out.println("Тип транспорта " + currentTour.getTransport());
            System.out.println(" ");
        }
    }

    public void chooseTour(int number) {
        GeneralTour currentTour = tours.get(number - 1);
        System.out.println("Номер тура: " + currentTour.getNumber());
        System.out.println("Тип тура: " + currentTour.getTypeName());
        System.out.println("Длительность тура: " + currentTour.getDays());
        System.out.println("Тип питания: " + currentTour.getFood());
        System.out.println("Тип транспорта " + currentTour.getTransport());
        System.out.println(" ");
    }


    public void askQuestion() {
        SortClass sortClass = new SortClass(this);
        String inputStr;
        int inputInt;
        boolean choosen = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Отсортировать по транспорту ?  (yes, no)");
        inputStr = scan.nextLine();
        if (inputStr.equals("yes")) {
            sortClass.sortByTransport();
            System.out.println("Виберите тур");
            inputInt = scan.nextInt();
            while (!choosen) {
                if (inputInt > 0 && inputInt < tours.size()) {
                    chooseTour(inputInt);
                    choosen = true;
                } else {
                    System.out.println("Тура по данному номеру не существует");
                    System.out.println("Виберите тур");
                    inputInt = scan.nextInt();
                }
            }

        } else if (inputStr.equals("no")) {
            System.out.println("Отсортировать по питанию ?  (yes, no)");
            inputStr = scan.nextLine();
            if (inputStr.equals("yes")) {
                sortClass.sortByFood();
                System.out.println("Виберите тур");
                inputInt = scan.nextInt();
                while (!choosen) {
                    if (inputInt > 0 && inputInt < tours.size()) {
                        chooseTour(inputInt);
                        choosen = true;
                    } else {
                        System.out.println("Тура по данному номеру не существует");
                        System.out.println("Виберите тур");
                        inputInt = scan.nextInt();
                    }
                }

            } else {
                System.out.println("Отсортировать по количеству дней ?  (yes, no)");
                inputStr = scan.nextLine();
                if (inputStr.equals("yes")) {
                    sortClass.sortByDays();
                    System.out.println("Виберите тур");
                    inputInt = scan.nextInt();
                    while (!choosen) {
                        if (inputInt > 0 && inputInt < tours.size() + 1) {
                            chooseTour(inputInt);
                            choosen = true;
                        } else {
                            System.out.println("Тура по данному номеру не существует");
                            System.out.println("Виберите тур");
                            inputInt = scan.nextInt();
                        }
                    }
                }

            }
        }
    }


//    public class SortClass {
//
//        public void sortByTransport() {
//            ArrayList<GeneralTour> airplainTours = new ArrayList<>();
//            ArrayList<GeneralTour> busTours = new ArrayList<>();
//
//            for (int i = 0; i < tours.size(); i++) {
//                if (tours.get(i).getTransport() == "Airplain") {
//                    airplainTours.add(tours.get(i));
//                } else {
//                    busTours.add(tours.get(i));
//                }
//            }
//            showAll(airplainTours);
//            showAll(busTours);
//        }
//
//        public void sortByDays() {
//            ArrayList<GeneralTour> sevenDayTours = new ArrayList<>();
//            ArrayList<GeneralTour> tenDaysTours = new ArrayList<>();
//
//            for (int i = 0; i < tours.size(); i++) {
//                if (tours.get(i).getDays() == 7) {
//                    sevenDayTours.add(tours.get(i));
//                } else {
//                    tenDaysTours.add(tours.get(i));
//                }
//            }
//            showAll(sevenDayTours);
//            showAll(tenDaysTours);
//        }
//
//        public void sortByFood() {
//            ArrayList<GeneralTour> allIncTours = new ArrayList<>();
//            ArrayList<GeneralTour> onlyBreakfstTours = new ArrayList<>();
//
//            for (int i = 0; i < tours.size(); i++) {
//                if (tours.get(i).getFood() == "All inclusive") {
//                    allIncTours.add(tours.get(i));
//                } else {
//                    onlyBreakfstTours.add(tours.get(i));
//                }
//            }
//            showAll(allIncTours);
//            showAll(onlyBreakfstTours);
//        }
//
//    }


}
