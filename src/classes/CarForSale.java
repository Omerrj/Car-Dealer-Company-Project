package classes;

import java.util.*;

public class CarForSale {
    List<Car> list = new LinkedList<Car>();

    public CarForSale(Car car) {
        list.add(car);
    }

    public Object getCar(String id) {
        for (int i = 0; i < list.size(); i++) {
            Car car = list.get(i);
            if (car.getId() == id)
                return car;

        }

        return false;
    }

    public void getList() {
        System.out.println("List of cars for sale");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getInfo());
        }
    }

    public void sellCar(String id) {
    }
}
