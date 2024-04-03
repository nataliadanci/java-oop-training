package arrayList;

import set.Book;

public class Laptop {

    private String brand;
    private int price;

    public Laptop(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString(){
        return brand + " " + price;
    }

    @Override
    public boolean equals(Object o){
        Laptop laptop = (Laptop) o;
        return this.brand == laptop.brand &&
                this.price == laptop.price;
    }

    @Override
    public int hashCode(){
        return brand.hashCode() + price;

    }
}
