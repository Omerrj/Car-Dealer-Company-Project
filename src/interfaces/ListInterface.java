package interfaces;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import model.Car;

public interface ListInterface {
    abstract Optional<Car> getCar(String id);

    abstract List<Car> getList();

    abstract void setList(List<Car> list);

    abstract void addToList(Car car) throws IOException;

    abstract Optional<Car> removeFromList(String id) throws IOException;

}
