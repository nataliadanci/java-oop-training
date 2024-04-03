package map.treeMap;

import java.util.Comparator;


public class MySalaryComp implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {

        if (e1.getSalary() == e2.getSalary()){
            return 0;
        }
        if (e1.getSalary() > e2.getSalary()){
            return 1;
        }
        return -1;
    }
}

