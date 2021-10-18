package classes;

import java.util.*;

import interfaces.ListInterface;

public class OrderedCars implements ListInterface {
    List<Car> list = new LinkedList<Car>();

    public OrderedCars() {
        System.out.println("List of Ordered Cars Created");
    }

    public OrderedCars(Car car) {
        this();
        list.add(car);
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
        System.out.println("List of Ordered Cars");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId());
            System.out.println(i + 1 + "-" + list.get(i).toString());
        }
    }

    @Override
    public void addToList(Car car) {
        list.add(car);
        System.out.println("Car Ordered " + "( " + car.toString() + " )");

    }

    @Override
    public void removeFromList(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id)
                list.remove(i);

        }
    }

}
