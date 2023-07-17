package Serialization;

import java.io.Serializable;

public class DeviceEmployee implements Serializable {
    private String name;
    private int price;

    public DeviceEmployee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "DeviceEmployee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
