import model.*;
import view.CarForSaleView;

import java.io.*;

import controller.DataBaseController;

public class Main {

        public static void main(String[] args) throws IOException, ClassNotFoundException {

                DataBaseController.loadDataBase();

                CarForSaleView.run();

        }

}