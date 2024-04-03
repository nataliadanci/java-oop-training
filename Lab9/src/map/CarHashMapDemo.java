package map;

import java.util.HashMap;
import java.util.Map;

public class CarHashMapDemo {
    public static void main(String[] args){
        Car car1 = new Car("Audi","Black",2013);
        Car car2 = new Car("BMW","Red",2017);
        Car car3 = new Car("Dacia","Brown",2000);
        Car car4 = new Car("Renault","Grey",2020);
        Car car5 = new Car("Dacia","Brown",2000); //car5.equals(car3)=TRUE


        Map<Car,Integer> carsMap = new HashMap<>();
        carsMap.put(car1,5);
        carsMap.put(car2,1);
        carsMap.put(car3,5);
        carsMap.put(car4,10);
        carsMap.put(car1,6); //daca cheia e un obiect care exista deja in lista,
                            // se va suprascrie valoarea initiala cu cea din ultima pereche adaugata
        carsMap.put(car5,2); //daca cheia e egala cu un obiect(egalitate verificata cu equals) care exista deja in lista,
                            // se va suprascrie valoarea initiala cu cea din ultima pereche adaugata


        //iterate only over the keys
        System.out.println("The list of keys: ");
        for(Car keyCar : carsMap.keySet()){
            System.out.println(keyCar);
        }

        //iterate only over the values
        System.out.println("The list of values: ");
        for(Integer value : carsMap.values()){
            System.out.println(value);
        }

        //iterate over the pairs
        System.out.println("The pairs are: ");
        //the type of pair is always Map.Entry<K,V>
        for(Map.Entry<Car,Integer> pair : carsMap.entrySet()){
            System.out.println(pair);
        }

        System.out.println("Total of pairs: " + carsMap.size());

        System.out.println("The cars, 5 in the shop: ");
        for(Map.Entry<Car,Integer> pair : carsMap.entrySet()){
            if(pair.getValue()==5){
                System.out.println(pair.getKey());
            }
        }

        for(Map.Entry<Car,Integer> pair : carsMap.entrySet()){
            if(pair.getKey().equals(car2)){
                int initialCount = pair.getValue();
                int finalCount = initialCount + 2;
                carsMap.put(car2,finalCount);
            }
        }

        //iterate over the pairs
        System.out.println("The pairs are: ");
        //the type of pair is always Map.Entry<K,V>
        for(Map.Entry<Car,Integer> pair : carsMap.entrySet()){
            System.out.println(pair);
        }

        Car car6 = null;
        carsMap.put(car6,10);

        Car car7 = null;
        carsMap.put(car7,7); //se comporta obisnuit si suprascrie

        System.out.println("The pairs with one null key are: ");
        //the type of pair is always Map.Entry<K,V>
        for(Map.Entry<Car,Integer> pair : carsMap.entrySet()){
            System.out.println(pair);
        }

        Car car8 = new Car("Fiat","yellow",2015);
        Car car9 = new Car("Mini Cooper","blue",1990);

        carsMap.put(car8,null);
        carsMap.put(car9,null);

        System.out.println("The pairs with null values are: ");
        //the type of pair is always Map.Entry<K,V>
        for(Map.Entry<Car,Integer> pair : carsMap.entrySet()){
            System.out.println(pair);
        }


    }
}
