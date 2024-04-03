package cloning;

public class CloningDemo {

    public static void main(String[] args) {

        Employee employee10 = new Employee("Daniel", "Smith", 21);
        Employee employee20 = employee10;
        Employee employee3;

        try {
            //clone the Employee object
            employee3 = (Employee) employee10.clone();
            employee10.setFirstName("modified");
            System.out.println(employee10.getFirstName());
            System.out.println(employee20.getFirstName());
            System.out.println(employee3.getFirstName());
            System.out.println();

            //check the addresses
            System.out.println(System.identityHashCode(employee10));
            System.out.println(System.identityHashCode(employee3));
            System.out.println(System.identityHashCode(employee20));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

       /* Employee employee10= new Employee("Daniel", "Smith", 21);
        Employee employee20 = employee10; //ambele obiecte au aceeasi adresa; sunt un singur obiect,
                                    // daca se modifica ceva la primul obiect se modifica si la al doilea
        System.out.println(System.identityHashCode(employee10));
        System.out.println(System.identityHashCode(employee20));
        employee10.setFirstName("modified");
        System.out.println(employee20.getFirstName());
        employee20.setAge(25);
        System.out.println(employee10.getAge());*/
    }
}
