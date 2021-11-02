package model;

import java.io.*;
import java.util.*;

import interfaces.ListInterface;

public class CarForSale implements ListInterface {
    private static List<Car> list = new LinkedList<Car>();

    public CarForSale() {
    }

    public CarForSale(Car car) throws IOException {
        addToList(car);
    }

    public Optional<Car> getCar(String id) {
        for (int i = 0; i < list.size(); i++) {
            Car car = list.get(i);
            if (car.getId() == id)
                return Optional.of(car);
        }
        return Optional.empty();
    }

    public List<Car> getList() {
        return CarForSale.list;
    }

    @Override
    public void setList(List<Car> list) {
        CarForSale.list = list;
    }

    @Override
    public void addToList(Car car) {
        list.add(car);

    }

    @Override
    public Optional<Car> removeFromList(String id) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return Optional.of(list.remove(i));
            }

        }

        return Optional.empty();

    }
}
