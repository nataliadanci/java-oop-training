package map.treeMap;

import java.util.*;

public class TreeMapStringDemo {

    public static void main(String[] args) {

        // Set text in a string
        String text = "Buna dimineata. Sa aveti ore cu folos. Vizita placuta!. Distrati-va! Buna dimineata si tie!";

        text = text.trim();

        // Create a TreeMap to hold words as key and count as value
        Map<String, Integer> map = new TreeMap<>();
        String[] words = text.split("[ \n\t\r-.,;:!?(){}]");
        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();

            if (key.length() > 0) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);
                } else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);
                }
            }
        }

        // Get all entries into a set
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        // Get key and value from each entry
        for (Map.Entry<String, Integer> entry : entrySet)
            System.out.println(entry.getKey() + "\t" + entry.getValue());

        System.out.println("The keys are: ");
        for(String key:map.keySet()){
            System.out.println(key);
        }
        for(Integer value:map.values()){
            System.out.println(value);
        }

        //For TreeMap class we have additional specific methods which are not defined in the Map Interface
        System.out.println("The first key: " + ((TreeMap)map).firstKey());
        System.out.println("The last key: " + ((TreeMap)map).lastKey());
        System.out.println("The first value: " + ((TreeMap)map).firstEntry().getValue());
        System.out.println("The first value: " + ((TreeMap)map).lastEntry().getValue());

        //the cast is needed for the declared Map to be seen as a TreeMap (even if it is indeed a TreeMap)
        TreeMap<String,Integer> initialTreeMap = (TreeMap<String, Integer>) map;

        //the method returns an object of type SortedMap which cannot be directly cast to TreeMap
        SortedMap<String,Integer> sortedMapHead = initialTreeMap.headMap("folos");

        System.out.println("The map with keys smaller than \"folos\" : ");
        for (Map.Entry<String, Integer> entry : sortedMapHead.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        //putAll() is used here because sortedMap cannot be cast to TreeMap
        TreeMap<String,Integer> treeMapHead = new TreeMap<>();
        treeMapHead.putAll(sortedMapHead); //putAll() method is used to insert in the Map multiple pairs,
                                            // all the pairs from another Map

        SortedMap<String,Integer> subMap = initialTreeMap.subMap("folos","tie");

        System.out.println("The map with keys bigger than \"folos\" and smaller than \"tie\" : ");
        for (Map.Entry<String, Integer> entry : subMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        SortedMap<String,Integer> tailMap = initialTreeMap.tailMap("tie");

        System.out.println("The map with keys bigger than \"tie\" : ");
        for (Map.Entry<String, Integer> entry : tailMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        System.out.println("Higher key for \"folos\": " + initialTreeMap.higherKey("folos"));
        System.out.println("Higher key for \"vizita\": " + initialTreeMap.higherKey("vizita"));

        System.out.println("Lower key for \"folos\": " + initialTreeMap.lowerKey("folos"));
        System.out.println("Lower key for \"aveti\": " + initialTreeMap.lowerKey("aveti"));

        System.out.println("Ceiling key for \"folos\": " + initialTreeMap.ceilingKey("folos"));
        System.out.println("Ceiling key for \"fagure\": " + initialTreeMap.ceilingKey("fagure"));

        System.out.println("Floor key for \"folos\": " + initialTreeMap.floorKey("folos"));
        System.out.println("Floor key for \"fagure\": " + initialTreeMap.floorKey("fagure"));

    }

}

