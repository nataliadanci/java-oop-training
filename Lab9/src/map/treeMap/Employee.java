package map.treeMap;

public class Employee  {

    private String name;
    private int salary;

    public Employee(String n, int s) {
        this.name = n;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + this.name + "-- Salary: " + this.salary;
    }

    //the method compareTo is used to compare two objects of the same type
    //in order to allow them to have an order
    //the method returns an Integer value with the following meaning:
    // 0 -> the objects are equal
    // >0 -> the first object is bigger
    // <0 -> the first object is smaller

   /* @Override
    public int compareTo(Employee o) { //compare by salary

        if(this.salary == o.salary){
            return 0;
        }
        if(this.salary > o.salary){
            return 1;
        }
        return -1;
    }*/

    /*@Override
    public int compareTo(Employee o) { //compare by name
        return this.name.compareTo(o.name);
    }*/
}
