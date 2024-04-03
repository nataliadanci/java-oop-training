package map.hash.code;

public class Employee {

    private  String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department){
        this.name = name;
        this.age = age;
        this.department = department;
    }
    @Override
    public String toString(){
        return name + " " + age + " " + department;
    }

    @Override
    public boolean equals(Object o){
        Employee employee = (Employee) o;
        return name.equals(employee.name) &&
                age == employee.age && department.equals(employee.department);
    }

    //exista mai multe metode corecte de al implementa
    //indiferent de implementarea aleasa, trebuie sa avem grija sa nu se returneze aceeasi valoare
    //cand este apelat hashCode() pentru obiecte pentru care equals() returneaza fals
    @Override
    public int hashCode(){
        //return 10; - nu respecta conditia
        String builtString = name + age + department;
        return builtString.hashCode(); // trebuie gasita o implementare care foloseste
                                        // toate atributele clasei
    }
}
