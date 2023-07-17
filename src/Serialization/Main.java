package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Dmytro", "Sirko", 25, "IT", new DeviceEmployee("Laptop", 1000));
        Employee employee2 = new Employee(2, "Olena", "Shvidka", 27, "IT", new DeviceEmployee("PC", 800));

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("employees.bin"))) {
            objectOutputStream.writeObject(employee1);
            objectOutputStream.writeObject(employee2);
            System.out.println("Objects are successfully serialized!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
