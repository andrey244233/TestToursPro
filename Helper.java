import AirplainTours.*;
import AirplainTours.Tours.CruisTour;
import AirplainTours.Tours.ExcursionTour;
import AirplainTours.Tours.HealthTour;
import AirplainTours.Tours.ShopingTour;
import BusTours.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Helper {


    public List<GeneralTour> tours = new ArrayList<>();

    public void createAirplainTours() {
        int number = 1;
        tours.add(new CruisTour(number++));
        tours.add(new ExcursionTour(number++));
        tours.add(new HealthTour(number++));
        tours.add(new ShopingTour(number++));

        tours.add(new BusTours.Tours.CruisTour(number++));
        tours.add(new BusTours.Tours.ExcursionTour(number++));
        tours.add(new BusTours.Tours.HealthTour(number++));
        tours.add(new BusTours.Tours.ShopingTour(number++));

    }

    public void showAll(ArrayList<GeneralTour> currentTours) {
        for (int i = 0; i < currentTours.size(); i++) {
            GeneralTour currentTour = currentTours.get(i);
            currentTour.showFields();
            System.out.println(" ");
        }
    }

    public void chooseTour(int number) {
        GeneralTour currentTour = tours.get(number - 1);
        currentTour.showFields();
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


}
