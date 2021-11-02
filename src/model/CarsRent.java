package model;

import java.io.IOException;

import java.util.*;

import interfaces.ListInterface;

public class CarsRent implements ListInterface {

    public List<Car> list = new LinkedList<Car>();

    @Override
    public Optional<Car> getCar(String id) {
        for (int i = 0; i < list.size(); i++) {
            Car car = list.get(i);
            if (car.getId() == id)
                return Optional.of(car);
        }
        return Optional.empty();
    }

    @Override
    public List<Car> getList() {
        return list;
    }

    @Override
    public void setList(List<Car> list) {
        this.list = list;

    }

    @Override
    public void addToList(Car car) throws IOException {
        list.add(car);
    }

    @Override
    public Optional<Car> removeFromList(String id) throws IOException {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {

                return Optional.of(list.remove(i));
            }

        }

        return Optional.empty();

    }

}
