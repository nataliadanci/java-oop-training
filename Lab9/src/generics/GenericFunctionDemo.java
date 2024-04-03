package generics;

import java.io.File;

public class GenericFunctionDemo {

    // A Generic method example, we need to explicitly specify that this is a generic method and what
    // is the parameter type(T) and how many parameters there are(just one, T)
    // because the class GenericFunctionDemo has not specified any parameter. We specify this with the
    // following syntax: <T>. This is not the return type of the method!

    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        // Calling generic method with Integer argument
        genericDisplay(103);

        // Calling generic method with String argument
        genericDisplay("John is here.");

        // Calling generic method with double argument
        genericDisplay(35.2);

        // Calling generic method with boolean argument
        genericDisplay(true);

        // Calling generic method with File argument
        genericDisplay(new File("pathname"));
    }
}
