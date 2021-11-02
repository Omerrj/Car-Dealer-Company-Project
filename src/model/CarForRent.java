package model;

import java.io.IOException;

import java.util.*;

import controller.DataBaseController;
import interfaces.ListInterface;

public class CarForRent implements ListInterface {
    private List<Car> list = new LinkedList<Car>();

    public CarForRent() {

    }

    public CarForRent(Car car) throws IOException {
        addToList(car);
    }

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
        return this.list;
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

    // TODO take it to the controller
    public void rentCar(String id) throws IOException {

        // CarsRent.AddToList(getCar(id).get());

        // TODO save should not be here
        DataBaseController.saveToDatabase();

        System.out.println("Car added to the rented list " + "( " + getCar(id) + " )");

        removeFromList(id);
    }

}
