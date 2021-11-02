import view.MainView;

import java.io.*;

import controller.DataBaseController;

public class Main {

        public static void main(String[] args) throws IOException, ClassNotFoundException {

                DataBaseController.loadDataBase();

                MainView mainView = new MainView();
                mainView.run();

        }

}