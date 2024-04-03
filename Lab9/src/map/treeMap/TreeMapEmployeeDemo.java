package map.treeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEmployeeDemo {
    public static void main(String a[]) {

        //By using salary comparator (int comparison)
        MySalaryComp mySalaryComparator = new MySalaryComp();
        TreeMap<Employee, String> tm = new TreeMap<>(mySalaryComparator);
        tm.put(new Employee("Ram", 3000), "RAM");
        tm.put(new Employee("John", 6000), "JOHN");
        tm.put(new Employee("Crish", 2000), "CRISH");
        tm.put(new Employee("Tom", 2400), "TOM");
        Set<Employee> keys = tm.keySet();
        System.out.println("The values are sorted ascending by salary: ");
        for (Employee key : keys) {
            System.out.println(key + " ==> " + tm.get(key));
        }
        System.out.println("\n\n");

        //By using name comparator (String comparison)
        MyNameComp myNameComparator = new MyNameComp();
        TreeMap<Employee, String> trmap = new TreeMap<>(myNameComparator);
        trmap.put(new Employee("Ram", 3000), "RAM");
        trmap.put(new Employee("John", 6000), "JOHN");
        trmap.put(new Employee("Crish", 2000), "CRISH");
        trmap.put(new Employee("Tom", 2400), "TOM");
        Set<Employee> ks = trmap.keySet();
        System.out.println("The values are sorted ascending by name: ");
        for (Employee key : ks) {
            System.out.println(key + " ==> " + trmap.get(key));
        }
    }
}
