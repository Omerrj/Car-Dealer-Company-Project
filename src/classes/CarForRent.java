package classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import interfaces.ListInterface;

public class CarForRent implements ListInterface {
    static List<Car> list = new LinkedList<Car>();

    public CarForRent() {
        System.out.println("List of cars for rent created");
    }

    public CarForRent(Car car) throws IOException {
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

    public static void load() throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream("data/rentList.txt");
        ObjectInputStream in = new ObjectInputStream(fin);
        list = (List<Car>) in.readObject();

        in.close();
    }

    public static void save() throws IOException {

        FileOutputStream fout = new FileOutputStream("data/rentList.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(list);

        out.close();
    }

    @Override
    public void getList() {
        System.out.println("List of cars for rent");
        for (int i = 0; i < list.size(); i++) {

            System.out.println(i + 1 + "-" + list.get(i).toString());
        }
    }

    @Override
    public void addToList(Car car) throws IOException {
        list.add(car);
        System.out.println("Car added to the rent list " + "( " + car.toString() + " )");

        save();
    }

    @Override
    public void removeFromList(String id) throws IOException {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println("Car removed from the rent list " + "( " + list.get(i).toString() + " )");
                list.remove(i);
            }

        }

        save();
    }

    public void rentCar(String id) throws IOException {

        CarsRent.AddToList((Car) getCar(id));
        CarsRent.save();

        System.out.println("Car added to the rented list " + "( " + getCar(id) + " )");

        removeFromList(id);
    }
}
