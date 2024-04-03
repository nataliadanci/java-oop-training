package exceptions;

import java.util.Scanner;

public class MultipleCatchBlockDemo {
    public static void main(String[] args) {

        try {
            int array[] = new int[5];

            System.out.println(array[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds");
        } catch (Exception e) {
            System.out.println("Parent Exception");
        }

//Exemplul 2

        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds");
        } catch (Exception e) {
            System.out.println("Parent Exception");

        }
//Exemplul 3

        try {
            int array[] = new int[5];
            System.out.println(array[10]);
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds");
        } catch (Exception e) {
            System.out.println("Parent Exception");
        }

        //Exemplul 4
        try {
            int array[] = new int[5];

            System.out.println(array[10]);
        } catch (Exception e) {
            System.out.println("Parent Exception");
        }

//Exemplul 5

        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("Parent Exception");
        }

//Exemplul 6

        try {
            Scanner scanner = new Scanner(System.in);
            int number =  scanner.nextInt();
            if(number%2==0){
                int array[] = new int[5];
                System.out.println(array[10]);
            }
            else {
                System.out.println(10/0);
            }
        } catch (ArithmeticException | IndexOutOfBoundsException exception) {
            System.out.println("Arithmetic or IndexOutOfBounds exception");
        }

    }
}
