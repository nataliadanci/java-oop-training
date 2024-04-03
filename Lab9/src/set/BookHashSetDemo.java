package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BookHashSetDemo {
    public static void main(String[] args){
        Book book1 = new Book("Morometii",300);
        Book book2 = new Book("Anna Karenina",600);
        Book book3 = new Book("Dear Dolly", 400);
        Book book4 = new Book("Dear Dolly", 400);// are alta adresa fata de book1

        // diferenta intre interfata Set si interfata List este faptul ca Set nu permite duplicate
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        System.out.println("Set size is: " + bookSet.size());

        bookSet.add(book1); // adresa lui book1 a fost deja adaugata la linia 15
        System.out.println("Set size is: " + bookSet.size());

        bookSet.add(book4); // un obiect cu acelasi hashcode si care este egal cu acesta a fost deja adaugat
                            //la linia 15
        System.out.println("Set size is: " + bookSet.size());



    }
}
