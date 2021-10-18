package classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import interfaces.ListInterface;

public class CarsRent implements ListInterface {

    static List<Car> list = new LinkedList<Car>();

    public static void GetList() {
        System.out.println("List of rented cars (Total) : " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + "-" + list.get(i).toString());
        }
    }

    public static void AddToList(Car car) throws IOException {
        list.add(car);
        System.out.println("Car added to the rented list " + "( " + car.toString() + " )");

        save();

    }

    public static void load() throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream("data/rentedList.txt");
        ObjectInputStream in = new ObjectInputStream(fin);
        list = (List<Car>) in.readObject();

        in.close();
    }

    public static void save() throws IOException {

        FileOutputStream fout = new FileOutputStream("data/rentedList.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(list);

        out.close();
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
        System.out.println("List of rented cars (Total) : " + list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + "-" + list.get(i).toString());
        }
    }

    @Override
    public void addToList(Car car) throws IOException {
        list.add(car);
        System.out.println("Car added to the rented list " + "( " + car.toString() + " )");

        save();
    }

    @Override
    public void removeFromList(String id) throws IOException {
        System.out.println("Car removed from the rented list " + "( " + getCar(id) + " )");
        list.remove(getCar(id));

        save();
    }

}
