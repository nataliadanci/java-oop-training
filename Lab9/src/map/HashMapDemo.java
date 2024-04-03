package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> vehicles = new HashMap<>();

        // Add some vehicles.
        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);

        System.out.println("Total vehicles: " + vehicles.size());

        // Iterate over all vehicles, using the keySet method.
        for (String key : vehicles.keySet()) {
            System.out.println(key + " - " + vehicles.get(key));
        }
        System.out.println();

        String searchKey = "Dacia";
        if (vehicles.containsKey(searchKey)) {
            System.out.println("Found total " + vehicles.get(searchKey) + " " + searchKey + " cars!\n");
        } else{
            System.out.println("This car was not found");
        }

        //Delete pair with key: BMW
        vehicles.remove("BMW");
        System.out.println("After remove operation, size: " + vehicles.size());
        // Clear all values.
        vehicles.clear();

        // Equals to zero.
        System.out.println("After clear operation, size: " + vehicles.size());
    }
}