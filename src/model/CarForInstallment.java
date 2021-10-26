package model;

import java.util.*;

import interfaces.ListInterface;
import java.io.*;

public class CarForInstallment implements ListInterface {

    public static List<Car> list = new LinkedList<Car>();

    public static void GetList() {
        System.out.println("List of cars for Installment");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + "-" + list.get(i).toString());
        }
    }

    public CarForInstallment() {
        System.out.println("List of cars for Installment created");
    }

    public CarForInstallment(Car car) throws IOException {
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
        System.out.println("List of cars for Installment");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + "-" + list.get(i).toString());
        }
    }

    @Override
    public void addToList(Car car) throws IOException {
        list.add(car);
        System.out.println("Car added to the Installment list " + "( " + car.toString() + " )");

    }

    @Override
    public void removeFromList(String id) throws IOException {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println("Car Removed from Installment List " + "( " + list.get(i).toString() + " )");
                list.remove(i);
            }

        }

    }

}
