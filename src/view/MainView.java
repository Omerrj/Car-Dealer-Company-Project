package view;

import java.io.IOException;
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

            option = Optional.ofNullable(console.nextInt());

        } while ((option.isEmpty()));

        option.ifPresent((in) -> {
            ClearScreen.run();
            switch (in) {
            case 1:
                try {
                    CarForSaleView.run();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                break;

            default:
                break;
            }
        });

    }
}
