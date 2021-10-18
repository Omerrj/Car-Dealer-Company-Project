import classes.Car;
import classes.CarForInstallment;
import classes.CarForRent;
import classes.CarForSale;
import classes.CarsRent;
import classes.OrderedCars;
import java.io.*;

public class Main {

        public static void main(String[] args) throws IOException, ClassNotFoundException {

                Car car = new Car("Toyota", "Camry", "XSE", "Gasoline", "White", 2020, "New", 0, "km", 3.5, 6, 26000,
                                "Automatic");

                Car car1 = new Car("car1", "model", "trim", "fuel", "color", 2020, "condition", 100, "km", 3.0, 4,
                                20000, "transmission");

                Car car2 = new Car("car2", "model", "trim", "fuel", "color", 2020, "condition", 100, "km", 3.0, 4,
                                20000, "transmission");

                CarForSale carForSale = new CarForSale();
                OrderedCars orders = new OrderedCars();

                carForSale.addToList(car);
                carForSale.addToList(car1);
                carForSale.addToList(car2);

                orders.addToList(car1);

                carForSale.getList();

        }

}