package view;

import model.Car;
import model.CarForSale;

import java.util.Scanner;

public class AddCarView {

    private static String fuel;

    static CarForSale carForSale = new CarForSale();

    public static void add() {

        Scanner console = new Scanner(System.in);

        System.out.println("1- See the list ");
        System.out.println("2- Add car to the list ");
        System.out.println("3- Remove Cars from the list ");

        System.out.println("What is the car Brand (Example: Toyota)");
        String brand = console.next();

        System.out.println("What is the car Model (Example: Camry)");
        String model = console.next();

        System.out.println("What is the car Trim (Example: XSE)");
        String trim = console.next();

        boolean loop = true;
        while (loop) {
            System.out.println("What is the car Fuel type?");
            System.out.println("1- Diesel");
            System.out.println("2- Gasoline");
            System.out.println("3- Hybrid");
            int fuelOption = console.nextInt();

            switch (fuelOption) {
            case 1:
                fuel = "Diesel";
                loop = false;

                break;

            case 2:
                fuel = "Gasoline";
                loop = false;

                break;

            case 3:
                fuel = "Hybrid";
                loop = false;
                break;

            default:
                break;
            }

        }

        System.out.println("What is the Color?");
        String color = console.next();

        System.out.println("What is the Creation Year?");
        int year = console.nextInt();

        System.out.println("What is the Car condition ? (Example: new , used: 2 parts)");
        String condition = console.next();

        System.out.println("What is the Car Range?");
        double range = console.nextDouble();

        System.out.println("What is the Range type? (Example: km , mi)");
        String rangeType = console.next();

        System.out.println("What is the Engine Size? (Example: 2.5)");
        double engineSize = console.nextDouble();

        System.out.println("What is the number of Cylinders? ");
        double cylinders = console.nextDouble();

        System.out.println("What is the Price in $? ");
        double price = console.nextDouble();

        System.out.println("What is the Transmission type (type: auto or manual)? ");
        String transmission = console.next();

        console.close();

        Car car = new Car(brand, model, trim, fuel, color, year, condition, range, rangeType, engineSize, cylinders,
                price, transmission);

        carForSale.addToList(car);

    }

}
