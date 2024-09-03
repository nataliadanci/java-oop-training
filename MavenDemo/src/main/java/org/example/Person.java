package org.example;

public class Person {
    private int age;

    public Person(int age){
        this.age = age;
    }

    public boolean isEligibleForDrivingLicense(){
        return age >= 18;
    }
}
