package iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args){

        ArrayList<String> words = new ArrayList<>(Arrays.asList("animal","food","flowers","glass","bed"));

        //we can also iterate through collections using iterators
        for (Iterator<String> it = words.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }

        /*int i = 0;
        for (Iterator<String> it = words.iterator(); it.hasNext(); ) {
            System.out.println(words.get(i++));
        }*/

        ListIterator<String> listIterator = words.listIterator();

        System.out.println("Forward direction iteration: ");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        //we can iterate in reverse order from the last element to the first only because with the previous
        //forward iteration we move the position of the iterator to the last element
        //if we try to iterate in this backward direction immediately after creating the listIterator
        //then it will not iterate because the first element does not have a previous one
        System.out.println("Backward direction iteration: ");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        //"animal","food","flowers","glass","bed"

        String value1 = listIterator.next();
        String value2 = listIterator.next();
        String value3 = listIterator.next();
        String value4 = listIterator.previous();

        System.out.println("Value4 is: " + value4);

    }
}
