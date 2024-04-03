package testDrivenDevelopment;

/* 3 -> ***
            * *
            ***
       4 -> ****
            *  *
            *  *
            ****
       5 -> *****
            *   *
            *   *
            *   *
            *****
     */

import org.junit.Test;

import static org.junit.Assert.assertEquals;

//Test driven development (TDD) it's a practice in which we write the unit test before doing the implementation.
//This helps us think of corner cases which will be considered during implementation.
//While writing the unit test we can consider the implementation a black box.

public class BorderCreationTest {

    @Test
    public void testBorderSize0(){
        String result = BorderCreation.createBorder(0);
        assertEquals("",result);
    }

    @Test
    public void testBorderSize1(){
        String result = BorderCreation.createBorder(1);
        assertEquals("*",result);
    }

    @Test
    public void testBorderSize2(){
        String result = BorderCreation.createBorder(2);

        StringBuilder expectedStringBuilder = new StringBuilder();
        expectedStringBuilder.append("**\n");
        expectedStringBuilder.append("**");

        assertEquals(expectedStringBuilder.toString(),result);
    }

    @Test
    public void testBorderSize4(){
        String result = BorderCreation.createBorder(4);

        StringBuilder expectedStringBuilder = new StringBuilder();
        expectedStringBuilder.append("****\n");
        expectedStringBuilder.append("*  *\n");
        expectedStringBuilder.append("*  *\n");
        expectedStringBuilder.append("****");

        assertEquals(expectedStringBuilder.toString(),result);
    }

    @Test
    public void testBorderSize5(){
        String result = BorderCreation.createBorder(5);
        //String concatenation (using the "+" operator) is not efficient because String objects are immutable
        //immutable(they cannot change their value after they have been created). This means that each time
        //when we concatenate two Strings a new one is created and memory it's allocated for it (the "new" keyword
        //it's used to call the constructor.
        String expected = "*****\n" + "*   *\n" + "*   *\n" + "*   *\n" + "*****";
        //System.out.println(expected);

        //the best solution for String concatenation is to use the Class StringBuilder and the method append()
        StringBuilder expectedStringBuilder = new StringBuilder();
        expectedStringBuilder.append("*****\n");
        expectedStringBuilder.append("*   *\n");
        expectedStringBuilder.append("*   *\n");
        expectedStringBuilder.append("*   *\n");
        expectedStringBuilder.append("*****");
        //System.out.println(expectedStringBuilder);

        assertEquals(expectedStringBuilder.toString(),result);
    }
}
