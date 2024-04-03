package map.hash.code;

public class HashCodeDemo {
    public static void main(String[] args){
        Employee employee1 = new Employee("Daniel",25,"Marketing");
        Employee employee2 = new Employee("Cristina",22,"Media");
        Employee employee3 = new Employee("Daniel",25,"Marketing");
        Employee employee4 = employee2;

        System.out.println("employee1==employee3?");
        System.out.println(employee1==employee3);

        System.out.println("employee1.equals(employee3)?");
        System.out.println(employee1.equals(employee3));

        System.out.println("employee1==employee2?");
        System.out.println(employee1==employee2);

        System.out.println("employee1.equals(employee2)?");
        System.out.println(employee1.equals(employee2));

        System.out.println("employee2==employee4?");
        System.out.println(employee2==employee4);

        System.out.println("employee2.equals(employee4)?");
        System.out.println(employee2.equals(employee4));

        System.out.println("Object reference (address) of employee1: ");
        System.out.println(System.identityHashCode(employee1));

        System.out.println("Object reference (address) of employee2: ");
        System.out.println(System.identityHashCode(employee2));

        System.out.println("Object reference (address) of employee3: ");
        System.out.println(System.identityHashCode(employee3));

        System.out.println("Object reference (address) of employee4: ");
        System.out.println(System.identityHashCode(employee4));

        //daca noi nu implementam hashCode in clasa Employee, atunci cand apelam metoda se va apela
        //cu implementarea default, care returneaza adresa obiectului
        //metoda hashCode, daca nu este suprascrisa in clasa employee, este mostenita din clasa parinte Object
        System.out.println("hashCode for employee1: " + employee1.hashCode());
        System.out.println("hashCode for employee2: " + employee2.hashCode());
        System.out.println("hashCode for employee3: " + employee3.hashCode());
        System.out.println("hashCode for employee4: " + employee4.hashCode());

        //intre metoda equals() si metoda hashCode() trebuie sa existe urmatoarea relatie:
                // pentru doua obiecte pentru care equals() returneaza true =>
                             // hashCode-ul celor doua obiecte trebuie sa fie egal
        //implementarea default a metodei hashCde nu ne asigura relatia de mai sus
        // si de aceea trebuie sa suprascriem noi metoda
    }
}
