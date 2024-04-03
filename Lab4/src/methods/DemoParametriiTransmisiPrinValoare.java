package methods;

import static methods.Person.*;

public class DemoParametriiTransmisiPrinValoare {
    public static void main(String[] args) {
        Person p = new Person("Initial Person");
        Person.modify1(p);
        System.out.println("Method modify1(Person p):" + p.getName());
        Person.modify2(p);
        System.out.println("Method modify2(Person p):" + p.getName());
        int initialNumber = 10;
        Person.modify3(initialNumber);
        System.out.println(initialNumber);
    }
}
