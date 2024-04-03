package serializable.student;

import serializable.student.Address;

import java.io.Serializable;

public class Student implements Serializable{

    private static final long serialversionUID = 129348938L;

    String name;
    int age;

    transient String cnp; // will not be serialized, and not saved in the file and not read from the file
    //String cnp; // will be serialized and saved
    static int value;
    Address address;

    public Student(String name, int age, String cnp, int value, Address address) {
        this.name = name;
        this.age = age;
        this.cnp = cnp;
        this.value = value;
        this.address = address;
    }

    public Student(String name, int age, String cnp) {
        this.name = name;
        this.age = age;
        this.cnp = cnp;
    }

    public String toString() {
        return "name = " + name + "\n" +
                "age = " + age + "\n" +
                "cnp = " + cnp + "\n" +
                "value = " + value + "\n" +
                "address = " + address;
    }
}
