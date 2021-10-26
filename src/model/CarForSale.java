package model;

import java.io.*;
import java.util.*;

import interfaces.ListInterface;

public class CarForSale implements ListInterface {
    public static List<Car> list = new LinkedList<Car>();

    public static void GetList() {
        System.out.println("List of cars for sale");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + "-" + list.get(i).toString());
        }
    }

    public CarForSale() {
        System.out.println("List of cars for sales created");
    }

    public CarForSale(Car car) throws IOException {
        this();
        addToList(car);
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
            System.out.println(i + 1 + "-" + list.get(i).toString());
        }
    }

    @Override
    public void addToList(Car car) {
        list.add(car);
        System.out.println("Car added to the sale list " + "( " + car.toString() + " )");

    }

    @Override
    public void removeFromList(String id) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println("Car sold " + "( " + list.get(i).toString() + " )");
                list.remove(i);
            }

        }

    }
}
