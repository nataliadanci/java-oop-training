package operations;

import org.junit.Assert;
import org.junit.Test;

public class MathOperationsTest {

    @Test
    public void add_TwoPlusTwo_ReturnsFour() {
        // Arrange
        final int expectedSum = 4;

        // Act
        final int actualSum = MathOperations.add(2, 2);

        // Assert
        Assert.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void divide_TenDividedByFive_ReturnsTwo() {
        final double expected = 2.0;

        final double actual = MathOperations.divide(10, 5);

        // 0.1f delta used for comparison
        Assert.assertEquals(actual, expected,0.1f);

        //Assert.assertEquals(7f, 7.5f,0.5f); // the third parameter (delta) it's used for setting the tolerance when
                                                // checking the equality
    }


    @Test(expected  = ArithmeticException.class)
    public void divide_TenDividedByZero_ThrowsArithmeticException() {
        MathOperations.divide(10, 0);
    }

    @Test
    public void multiply_TwoByTen_ReturnsTwenty() {
        // Arrange
        final int expectedResult = 20;

        // Act
        final int actualResult = MathOperations.multiply(2, 10);

        // Assert
        Assert.assertEquals(expectedResult, actualResult);

    }
}
