package generics;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

// We use < > to specify Parameter type for the class
public class SingleParameterDemo<T> {

    // An object of type T is declared
    T obj;

    SingleParameterDemo(T obj) {
        this.obj = obj;
    }

    //no need to specify that this method is generic with a parameter T because it belongs to
    // the generic class SingleParameterDemo<T>
    public T getObject() {
        return this.obj;
    }

    public static void main(String[] args) {
        // instance of Integer type
        SingleParameterDemo<Integer> integerObject = new SingleParameterDemo<>(15);
        System.out.println(integerObject.getObject());

        // instance of String type
        SingleParameterDemo<String> stringObject = new SingleParameterDemo<>("One String value.");
        System.out.println(stringObject.getObject());

        // instance of File type
        SingleParameterDemo<File> fileObject = new SingleParameterDemo<>(new File("filepath"));
        System.out.println(fileObject.getObject());

        //we cannot assign stringObject to integerObject because they hve different types
        // (SingleParameterDemo<Integer> and SingleParameterDemo<String>
        //integerObject = stringObject;

        List<SingleParameterDemo<Integer>> myList = new ArrayList<>();
        myList.add(new SingleParameterDemo<>(100));
        myList.add(new SingleParameterDemo<>(7));
        //myList.add(new SingleParameterDemo<>("Hello World!")); we cannot add it to the ArrayList because
                //the list is defined to allow only SingleParameterDemo<Integer> values
    }
}
