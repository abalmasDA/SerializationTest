package Deserealization;

import Serialization.DeviceEmployee;
import Serialization.Employee;

import java.io.*;

/**
 * Необхідно здійснити десеріалізацію з файлу будь якого файлу(класу)
 * та вивести на екран вміст.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee1;
        Employee employee2;

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employees.bin"))) {
            employee1 = (Employee) objectInputStream.readObject();
            employee2 = (Employee) objectInputStream.readObject();
            System.out.println("Objects are successfully deserialized!");
            System.out.println(employee1);
            System.out.println(employee2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
