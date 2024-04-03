package arrayList;

import java.util.ArrayList;
import java.util.List;

public class LaptopArrayListDemo {
    public static void main(String[] args){
        Laptop laptop1 = new Laptop("Lenovo",1500);
        Laptop laptop2 = new Laptop("Asus",3000);
        Laptop laptop3 = new Laptop("Dell",4000);
        Laptop laptop4 = new Laptop("Apple",8000);
        Laptop laptop7 = new Laptop("Apple",8000);

        List<Laptop> laptopList = new ArrayList<>();

        System.out.println("Is ArrayList of laptops empty? " + laptopList.isEmpty());

        laptopList.add(laptop1);
        laptopList.add(laptop2);
        laptopList.add(laptop3);
        laptopList.add(laptop4);
        laptopList.add(laptop1);
        laptopList.add(laptop7);

        // laptopList.add("masina"); - deoarece avem List<Laptop> putem sa punem doar laptopuri in aceasta colectie

        System.out.println("Numarul de laptopuri este: " + laptopList.size());
        System.out.println("Lista laptopuri: ");

        for( Laptop laptop : laptopList){
            System.out.println(laptop);
        }

        System.out.println("Is ArrayList of laptops empty? " + laptopList.isEmpty());

        Laptop laptop5 = new Laptop("Lenovo",5500);
        laptopList.add(2,laptop5);
        printLaptops(laptopList);

        laptopList.remove(1);
        printLaptops(laptopList);

        laptopList.remove(laptop3);
        printLaptops(laptopList);

        Laptop laptop6 = new Laptop("Macbook",4444);
        System.out.println("Do we have Macbook? " + laptopList.contains(laptop6));
        System.out.println("Do we have Lenovo 1500? " + laptopList.contains(laptop1));

        //de continuat cu indexOf
    }

    public static void printLaptops(List<Laptop> listOfLaptops){
        System.out.println("Lista laptopuri: ");

        for( Laptop laptop : listOfLaptops){
            System.out.println(laptop);
        }
    }
}
