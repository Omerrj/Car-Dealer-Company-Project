package model;

import java.io.IOException;

import java.util.*;

import controller.DataBaseController;
import interfaces.ListInterface;

public class CarForRent implements ListInterface {
    public static List<Car> list = new LinkedList<Car>();

    public CarForRent() {
        System.out.println("List of cars for rent created");
    }

    public CarForRent(Car car) throws IOException {
        this();
        addToList(car);
    }

    @Override
    public Object getCar(String id) {
        for (int i = 0; i < list.size(); i++) {
            Car car = list.get(i);

            if (car.getId() == id)
                return car;

        }

        return false;
    }

    @Override
    public void getList() {
        System.out.println("List of cars for rent");
        for (int i = 0; i < list.size(); i++) {

            System.out.println(i + 1 + "-" + list.get(i).toString());
        }
    }

    @Override
    public void addToList(Car car) throws IOException {
        list.add(car);
        System.out.println("Car added to the rent list " + "( " + car.toString() + " )");

    }

    @Override
    public void removeFromList(String id) throws IOException {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println("Car removed from the rent list " + "( " + list.get(i).toString() + " )");
                list.remove(i);
            }

        }

    }

    public void rentCar(String id) throws IOException {

        CarsRent.AddToList((Car) getCar(id));

        // TODO save should not be here
        DataBaseController.saveToDatabase();

        System.out.println("Car added to the rented list " + "( " + getCar(id) + " )");

        removeFromList(id);
    }

}
