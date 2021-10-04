package classes;

import java.util.HashMap;
import java.util.UUID;

public class Car {

    private HashMap info = new HashMap();

    public Car(String brand, String model, String trim, String fuel, String color, String year, String condition,
            String transmission, String range, String rangeType, String engineSize, String cylinders, String price) {

        info.put("id", UUID.randomUUID());
        info.put("brand", brand);
        info.put("model", model);
        info.put("trim", trim);
        info.put("fuel", fuel);
        info.put("color", color);
        info.put("year", year);
        info.put("condition", condition);
        info.put("transmission", transmission);
        info.put("range", range);
        info.put("rangeType", rangeType);
        info.put("engineSize", engineSize);
        info.put("cylinders", cylinders);
        info.put("price", price);
    }

    public HashMap getInfo() {
        return info;
    }

    public String getInfo(String key) {
        return info.get(key).toString();
    }

    public void setInfo(String key, String value) {
        info.put(key, value);
    }

}
