package view;

import java.util.Scanner;

public class RemoveCarView {

    public static int remove() {
        Scanner console = new Scanner(System.in);

        System.out.println("Select the car from the list to remove");
        int index = console.nextInt();

        console.close();

        return index - 1;
    }
}
