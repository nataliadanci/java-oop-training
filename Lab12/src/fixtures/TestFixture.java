package fixtures;
import junit.framework.*;

public class TestFixture extends TestCase {
    public int n1, n2;
    public int numberOfTestsExecuted = 0;


    // setarea valorilor n1, n2
    // metoda setUp() se apeleaza automat inainte de executarea fiecarui test
    public void setUp() {
        n1 = 2;
        n2 = 3;
        System.out.println("setUp: n1: " + n1 + ", n2: " + n2);
       /* numberOfTestsExecuted = numberOfTestsExecuted + 1;
        System.out.println("Number of tests run so far: " + numberOfTestsExecuted);*/
    }

    // operatii cu cele doua valori
    public void testAdd() {
        //int n1 = 10, n2 = 20; //e necesara initializarea doar daca nu folosim metoda setUp() care se apeleaza
                                  // automat inainte de fiecare test
        double result = n1 + n2;
        assertTrue(result == 5);
    }

    public void testSub() {
        //int n1 = 8, n2 = 10; //e necesara initializarea doar daca nu folosim metoda setUp() care se apeleaza
                                // automat inainte de fiecare test
        double result = n1 - n2;
        assertTrue(result < 0);
    }

    public void testMult() {
        double result = n1 * n2;
        assertTrue(result > 5);
    }

    public void testDiv() {
        double result = ((float)n1) / n2;
        assertTrue(result > 0);
    }

    //metoda rulata dupa executarea testelor
    public void tearDown() {
        n1 = 0;
        n2 = 0;
        System.out.println("tearDown: n1: " + n1 + ", n2: " + n2);
    }
}

