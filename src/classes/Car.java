package classes;

import java.util.UUID;

public class Car {

    private String id;
    private String brand;
    private String model;
    private String trim;
    private String fuel;
    private String color;
    private int year;
    private String condition;
    private double range;
    private String rangeType;
    private double engineSize;
    private double cylinders;
    private double price;
    private String transmission;

    public Car() {
        this.id = UUID.randomUUID().toString();
    }

    public Car(String brand, String model, String trim, String fuel, String color, int year, String condition,
            double range, String rangeType, double engineSize, double cylinders, double price, String transmission) {

        this();

        setBrand(brand);
        setModel(model);
        setTrim(trim);
        setFuel(fuel);
        setColor(color);
        setYear(year);
        setCondition(condition);
        setRange(range);
        setRangeType(rangeType);
        setEngineSize(engineSize);
        setCylinders(cylinders);
        setPrice(price);
        setTransmission(transmission);

    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getCondition() {
        return condition;
    }

    public double getCylinders() {
        return cylinders;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public String getFuel() {
        return fuel;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public double getRange() {
        return range;
    }

    public String getRangeType() {
        return rangeType;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getTrim() {
        return trim;
    }

    public int getYear() {
        return year;
    }

    public String getAllInfo() {

        return brand + " " + model + " " + trim + " " + color + " " + condition + " " + cylinders + " Cylinders "
                + engineSize + " L " + fuel + " " + price + "$" + range + rangeType + " " + transmission;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setCylinders(double cylinders) {
        this.cylinders = cylinders;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public void setRangeType(String rangeType) {
        this.rangeType = rangeType;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {

        return getAllInfo();
    }
}
