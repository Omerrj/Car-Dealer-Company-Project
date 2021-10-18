package interfaces;

import java.io.IOException;

import classes.Car;

public interface ListInterface {
    abstract Object getCar(String id);

    abstract void getList();

    abstract void addToList(Car car) throws IOException;

    abstract void removeFromList(String id) throws IOException;

}
