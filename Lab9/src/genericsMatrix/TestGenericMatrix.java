package genericsMatrix;

import java.math.BigDecimal;

public class TestGenericMatrix {
    public static void main(String[] args) {

        // Creaza tablourile de intregi m1, m2
        Integer[][] m1 = new Integer[][]{{1, 2, 3}, {4, 5, 6}, {1, 1, 1}};
        Integer[][] m2 = new Integer[][]{{1, 1, 1}, {2, 2, 2}, {0, 0, 0}};

        //we cannot crate an instance of an abstract class and in order to make use of its implemented methods
        //(methods that are not abstract) we should create a class that extends it and create
        // an instance of the child class
        //GenericMatrix genericMatrix = new GenericMatrix();

        // Creaza o instanta de IntegerMatrix
        IntegerMatrix integerMatrix = new IntegerMatrix();
        System.out.println("\nm1 + m2 is ");
        integerMatrix.printResult(m1, m2, integerMatrix.addMatrix(m1, m2), '+');
        System.out.println("\nm1 * m2 is ");
        integerMatrix.printResult(m1, m2, integerMatrix.multiplyMatrix(m1, m2), '*');

        BigDecimal[][] m3 = new BigDecimal[][]{{BigDecimal.valueOf(1),BigDecimal.valueOf(0),BigDecimal.valueOf(2)},
                {BigDecimal.valueOf(2),BigDecimal.valueOf(1),BigDecimal.valueOf(0)},
                {BigDecimal.valueOf(0),BigDecimal.valueOf(1),BigDecimal.valueOf(7)}};
        BigDecimal[][] m4 = new BigDecimal[][]{{BigDecimal.valueOf(2),BigDecimal.valueOf(3),BigDecimal.valueOf(6)},
                {BigDecimal.valueOf(7),BigDecimal.valueOf(0),BigDecimal.valueOf(3)},
                {BigDecimal.valueOf(5),BigDecimal.valueOf(1),BigDecimal.valueOf(8)}};

        BigDecimalMatrix bigDecimalMatrix = new BigDecimalMatrix();
        System.out.println("\n m3 + m4 is: ");
        bigDecimalMatrix.printResult(m3, m4, bigDecimalMatrix.addMatrix(m3, m4),'+');
        System.out.println("\n m3 * m4 is: ");
        bigDecimalMatrix.printResult(m3, m4, bigDecimalMatrix.multiplyMatrix(m3,m4),'*');

        /*Double doubleValue = 2.89;
        Long longValue = 10L;*/


    }
}