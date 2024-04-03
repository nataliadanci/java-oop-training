package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethodDemo {
    public static void main(String[] args){
        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(12, 4, 60, 13, 25, 10, 53, 66, 72, 80));
        //sort the elements
        //the static methods from Class Collections have a void type return and always modify the input collection
        //if we don't want to modify the input collection, we need to pass a copy of the initial collection and
        //this one will be modified
        ArrayList<Integer> valuesToBeSorted = new ArrayList<>(values);
        Collections.sort(valuesToBeSorted);
        System.out.println("After sorting: " + valuesToBeSorted);

        //reverse the elements
        ArrayList<Integer> valuesToBeReversed = new ArrayList<>(values);
        Collections.reverse(valuesToBeReversed);
        System.out.println("After reversing: " + valuesToBeReversed);

        //shuffle the elements
        ArrayList<Integer> valuesToBeShuffled = new ArrayList<>(values);
        Collections.shuffle(valuesToBeShuffled);
        System.out.println("After shuffling: " + valuesToBeShuffled);

        //search for a value in the list using the binary search algorithm
        //in order to use the binarySearch algorithm, the values need to be sorted in ascending order
        int found60 = Collections.binarySearch(valuesToBeSorted, 60);
        if(found60 >= 0){
            System.out.println("The value 60 has been found");
        }
        else{
            System.out.println("The value 60 has not been found");
        }

        int found2 = Collections.binarySearch(valuesToBeSorted,2);
        if(found2 >= 0){
            System.out.println("The value 2 has been found");
        }
        else{
            System.out.println("The value 2 has not been found");
        }

        //find the maximum value
        int maxValue = Collections.max(values);
        System.out.println("The maximum value is: " + maxValue);

        //find the minimum value
        int minValue = Collections.min(values);
        System.out.println("The minimum value is: " + minValue);

    }
}
