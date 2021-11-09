package view;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

import utils.ClearScreen;

public class MainView {

    Scanner console = new Scanner(System.in);

    public void run() {
        System.out.println("Welcome back!");

        Optional<Integer> option = Optional.empty();

        do {
            System.out.println("Select one from below");

            System.out.println("1- Cars for sale");
            System.out.println("2- Cars for rent");
            System.out.println("3- Rented Cars");
            System.out.println("4- Cars for installment ");
            System.out.println("5- Ordering Cars ");

            try {
                option = Optional.ofNullable(console.nextInt());

            } catch (InputMismatchException e) {
                ClearScreen.run();
                System.out.println("Please select from available Options");
                console.nextLine();
            }

        } while ((option.isEmpty() || !(option.get() instanceof Integer)));

        option.ifPresent((in) -> {
            ClearScreen.run();
            switch (in) {
            case 1:
                try {
                    CarForSaleView.run();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case 2:
                try {
                    CarForRentView.run();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case 3:
                try {
                    CarsRentedView.run();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case 4:
                try {
                    CarForInstallmentView.run();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            case 5:
                try {
                    OrderedCarsView.run();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            default:
                break;
            }
        });

    }
}
