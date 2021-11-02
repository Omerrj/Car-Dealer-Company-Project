package view;

import java.util.Scanner;

public class RemoveCarView {

    private static Scanner console = new Scanner(System.in);

    public static int run() {

        System.out.println("Select the car from the list to remove");
        int index = console.nextInt();

        return index - 1;
    }
}
