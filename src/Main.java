import view.MainView;

import java.io.*;
import java.net.Socket;

import controller.DataBaseController;
import utils.MySocket;

public class Main {

        public static void main(String[] args) throws IOException, ClassNotFoundException {

                DataBaseController.loadDataBase();

                MainView mainView = new MainView();
                MySocket socket = new MySocket();

                socket.startConnection("localhost", 3000);
                mainView.run();

        }

}