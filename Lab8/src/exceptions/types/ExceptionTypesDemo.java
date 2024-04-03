package exceptions.types;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionTypesDemo {
    public static void main(String[] args){
        System.out.println("Introduceti un numar: ");
        Scanner scanner = new Scanner(System.in);
        String stringNumber =  scanner.nextLine();

        try{
            int value1 = parseString(stringNumber);
            System.out.println("Numarul introdus la tastatura este: " + value1);
        }catch (NumberFormatException e){
            System.out.println("Nu se poate parsa numarul introdus");
        }

        String filePath = "src/exceptions/types/file.txt";

        try {
            int value2 = readFile(filePath);
            System.out.println("Numarul citit din fisier este: " + value2);
        } catch (IOException e){
            System.out.println("Exception while processing the file");
        }
    }

// NumberFormatException is a runtime exception (unchecked exception) because extends class RuntimeException
    // we are not forced to use a try-catch block or to declare it in the method definition, but we can do that
    public static int parseString(String string) throws NumberFormatException{
        int value = Integer.parseInt(string);
        return value;
    }

// IOException is a compile time exception (checked exception) because extends Exception
// It is recognised at compile time and we are forced to use try-catch block or to declare it in the method definition (throws ...)
    public static int readFile(String filePath) throws IOException {
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st = br.readLine();
        return parseString(st);
    }
}
