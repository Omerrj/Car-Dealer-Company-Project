package classes;

import java.util.*;

import interfaces.ListInterface;

public class CarForRent implements ListInterface {
    List<Car> list = new LinkedList<Car>();

    public CarForRent() {
        System.out.println("List of cars for rent created");
    }

    public CarForRent(Car car) {
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
            System.out.println(list.get(i).getId());
            System.out.println(i + 1 + "-" + list.get(i).toString());
        }
    }

    @Override
    public void addToList(Car car) {
        list.add(car);
        System.out.println("Car added to the rent list " + "( " + car.toString() + " )");

    }

    @Override
    public void removeFromList(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {

                list.remove(i);
                System.out.println("Car removed from the rent list " + "( " + list.get(i).toString() + " )");
            }

        }

    }
}
