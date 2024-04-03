public class Student {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public boolean equals(Object object){
        // clasa Object este clasa parinte pt toate clasele, inclusiv pt Student
        Student student = (Student)  object;
        return this.name == student.name &&
                this.age == student.age &&
                this.grade == student.grade;
    }
}
