package view;

import java.io.IOException;
import java.util.Scanner;

import controller.DataBaseController;
import model.CarForSale;

public class CarForSaleView {

    static boolean resume = true;
    static CarForSale carForSale = new CarForSale();

    public static void run() throws IOException {

        System.out.println("Welcome to the Sale List!");

        while (resume) {
            Scanner console = new Scanner(System.in);

            System.out.println("Please choose what do you need?");
            System.out.println("1- See the list ");
            System.out.println("2- Add car to the list ");
            System.out.println("3- Remove Cars from the list ");

            int option = console.nextInt();
            switch (option) {
            case 1:
                CarForSale.GetList();
                break;

            case 2:
                AddCarView.add();
                break;

            case 3:
                CarForSale.GetList();

                carForSale.removeFromList(CarForSale.list.get(RemoveCarView.remove()).getId());
                DataBaseController.saveToDatabase();

                break;

            default:
                break;
            }
        }

    }
}
