package classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import interfaces.ListInterface;

public class OrderedCars implements ListInterface {
    static List<Car> list = new LinkedList<Car>();

    public OrderedCars() {
        System.out.println("List of Ordered Cars Created");
    }

    public OrderedCars(Car car) {
        this();
        list.add(car);
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
        FileInputStream fin = new FileInputStream("data/orderedList.txt");
        ObjectInputStream in = new ObjectInputStream(fin);
        list = (List<Car>) in.readObject();

        in.close();

    }

    public static void save() throws IOException {

        FileOutputStream fout = new FileOutputStream("data/orderedList.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(list);

        out.close();
    }

    @Override
    public void getList() {
        System.out.println("List of Ordered Cars");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId());
            System.out.println(i + 1 + "-" + list.get(i).toString());
        }
    }

    @Override
    public void addToList(Car car) throws IOException {
        list.add(car);
        System.out.println("Car Ordered " + "( " + car.toString() + " )");

        save();

    }

    @Override
    public void removeFromList(String id) throws IOException {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id)
                list.remove(i);
        }

        save();
    }

}
