import classes.Car;
import classes.CarForSale;

public class Main {
    public static void main(String[] args) {

        Car camryXse = new Car("toyota", "camry", "xse", "petrol", "white", "2020", "new", "auto", "0", "km", "2.5",
                "4", "25000");

        System.out.println(camryXse.getInfo());
        camryXse.setInfo("color", "black");
        System.out.println(camryXse.getInfo());

        CarForSale carForSale = new CarForSale(camryXse);

        System.out.println(carForSale.getCar("39e0c94e-51ad-47be-8756-573219c44c7a"));

    }
}