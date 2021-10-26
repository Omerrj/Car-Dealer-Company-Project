package controller;

import model.*;
import java.io.*;
import java.util.List;

public class DataBaseController {

    public static void saveToDatabase() throws IOException {

        save(CarForSale.list, "data/saleList.txt");
        save(CarForInstallment.list, "data/installmentList.txt");
        save(OrderedCars.list, "data/orderedList.txt");
        save(CarForRent.list, "data/rentList.txt");
        save(CarsRent.list, "data/rentedList.txt");
    }

    public static void loadDataBase() throws IOException, ClassNotFoundException {

        load("saleList");
        load("rentList");
        load("orderedList");
        load("rentedList");
        load("installmentList");

    }

    private static void save(List list, String path) throws IOException {
        FileOutputStream fIn = new FileOutputStream(path);
        ObjectOutputStream fOut = new ObjectOutputStream(fIn);
        fOut.writeObject(list);

        fOut.close();
    }

    private static void load(String path) throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream("data/" + path + ".txt");
        ObjectInputStream in = new ObjectInputStream(fin);

        switch (path) {
        case "saleList":
            CarForSale.list = (List<Car>) in.readObject();

            break;
        case "rentList":
            CarForRent.list = (List<Car>) in.readObject();

            break;
        case "rentedList":
            CarsRent.list = (List<Car>) in.readObject();

            break;
        case "orderedList":
            OrderedCars.list = (List<Car>) in.readObject();

            break;
        case "Installment":
            CarForInstallment.list = (List<Car>) in.readObject();

            break;

        default:
            break;
        }

        in.close();
    }

}