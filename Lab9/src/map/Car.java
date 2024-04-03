package map;

import java.util.Objects;

public class Car {

    private String brand;
    private String color;
    private Integer year;

    public Car(String brand, String color,Integer year){
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public String toString(){
        return this.brand + ", " + this.color + ", " + this.year;
    }

    @Override
    public boolean equals(Object o){
        Car car = (Car) o;
        return this.brand.equals(car.brand) &&
                this.color.equals(car.color) &&
                Objects.equals(this.year, car.year); // in this way we remove the possibility
                                                    // of having null.equals(car.year)
    }

    @Override
    public int hashCode(){
        String builtString = brand + color + year;
        return builtString.hashCode();
    }

}
