package exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String args[]) {
        /*FileReader fr = null;
        try {
            File file = new File("src/exceptions/letters.txt");
            fr = new FileReader(file);
            char[] a = new char[50];
            fr.read(a);
            for (char c : a)
                System.out.print(c);
        } catch (IOException e) {
            System.out.println("IOException catched:");
            e.printStackTrace(System.out);
        } finally {
            try {
                fr.close();
            } catch (IOException | NullPointerException exception){
                exception.printStackTrace(System.out);
            }
        }*/

        //try-with-resources
        //try-with-resources nu are nevoie de blocul finally pt a inchide resursele pe care le deschide/foloseste deoarece
        // se ocupa singur cu inchiderea lor atat in cazul in care nu a fost aruncata o exceptie cat si in cazul in care a fost
        // aruncata o exceptie
        try(FileReader fr = new FileReader("src/exceptions/letters.txt")) {
            char [] a = new char[50];
            fr.read(a);
            for(char c : a)
                System.out.print(c);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
}
