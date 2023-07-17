package Serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String department;
    private DeviceEmployee deviceEmployee;

    public Employee(int id, String name, String surname, int age, String department, DeviceEmployee deviceEmployee) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.department = department;
        this.deviceEmployee = deviceEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", deviceEmployee=" + deviceEmployee +
                '}';
    }
}
