import classes.Car;

public class Main {
    public static void main(String[] args) {

        Car camryXse = new Car("toyota", "camry", "xse", "petrol", "white", "2020", "new", "auto", "0", "km", "2.5",
                "4", "25000");

        System.out.println(camryXse.getInfo());
        camryXse.setInfo("color", "black");
        System.out.println(camryXse.getInfo());
    }
}