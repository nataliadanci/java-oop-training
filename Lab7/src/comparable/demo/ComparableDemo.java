package comparable.demo;

import java.util.Arrays;

public class ComparableDemo {
    public static void main(String[] args){
        Student[] students = new Student[3];
        Student student1 = new Student("Georgea","Adina",20,9.8f);
        Student student2 = new Student("Fat","Alina",25,7.5f);
        Student student3 = new Student("Dat","Paul",23,8f);

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        print(students);
        Arrays.sort(students);
        System.out.println();
        print(students);

    }

    public static void print(Student[] students){
        for(int i=0;i<3;i++){
            System.out.print(students[i] + ", ");
        }
    }

}
