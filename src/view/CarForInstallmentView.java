package view;

import java.io.IOException;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import controller.DataBaseController;
import model.Car;
import model.CarForInstallment;
import utils.ClearScreen;

public class CarForInstallmentView {
    private static boolean resume = true;
    private static CarForInstallment carForInstallment = new CarForInstallment();

    public static void run() throws IOException {

        System.out.println("Welcome to the installment cars List!");

        Scanner console = new Scanner(System.in);
        while (resume) {

            System.out.println("Please choose what do you need?");
            System.out.println("1- See the list ");
            System.out.println("2- Add car to the list ");
            System.out.println("3- Remove Cars from the list ");

            int option = console.nextInt();
            switch (option) {
            case 1:
                ClearScreen.run();
                showTheList(carForInstallment.getList());

                break;

            case 2:
                AddCarView.run();
                DataBaseController.saveToDatabase();

                break;

            case 3:
                showTheList(carForInstallment.getList());

                carForInstallment.removeFromList(carForInstallment.getList().get(RemoveCarView.run()).getId());
                DataBaseController.saveToDatabase();

                break;

            default:
                break;
            }

        }
        console.close();

    }

    private static void showTheList(List<Car> list) {
        System.out.println("List of Cars for installment:");

        ListIterator<Car> iterator = (ListIterator<Car>) list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.nextIndex() + 1 + "- " + iterator.next().toString());
        }
    }
}
