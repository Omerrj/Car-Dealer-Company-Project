package interfaces;

import classes.Car;

public interface ListInterface {
    abstract Object getCar(String id);

    abstract void getList();

    abstract void addToList(Car car);

    abstract void removeFromList(String id);

}
