package controller;

import model.*;
import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class DataBaseController {

    private static List<List<Car>> database = new LinkedList<List<Car>>();

    private static CarForSale carForSale = new CarForSale();
    private static CarForInstallment carForInstallment = new CarForInstallment();
    private static OrderedCars orderedCars = new OrderedCars();
    private static CarForRent carForRent = new CarForRent();
    private static CarsRented carsRent = new CarsRented();

    public static void saveToDatabase() throws IOException {

        database.add(carForSale.getList());
        database.add(carForRent.getList());
        database.add(carForInstallment.getList());
        database.add(carsRent.getList());
        database.add(orderedCars.getList());

        save(database, "data/database.txt");

    }

    public static void loadDataBase() throws IOException, ClassNotFoundException {

        load("database");

        carForSale.setList(database.get(0));
        carForRent.setList(database.get(1));
        carForInstallment.setList(database.get(2));
        carsRent.setList(database.get(3));
        orderedCars.setList(database.get(4));

    }

    private static void save(List<List<Car>> list, String path) throws IOException {
        FileOutputStream fIn = new FileOutputStream(path);
        ObjectOutputStream fOut = new ObjectOutputStream(fIn);
        fOut.writeObject(list);

        fOut.close();
    }

    private static void load(String path) throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream("data/database.txt");
        ObjectInputStream in = new ObjectInputStream(fin);

        database = (List<List<Car>>) in.readObject();

        in.close();
    }

}