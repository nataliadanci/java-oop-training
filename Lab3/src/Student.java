public class Student {
    private String name;
    private int grade;

    private int id;

    public Student(String name, int grade, int id){
        this.name = name;
        this.grade = grade;
        this.id = id;
    }

    public boolean equals(Object object){
        // clasa Object este clasa parinte pt toate clasele, inclusiv pt Student
        Student student = (Student)  object;
        return this.name == student.name &&
                this.id == student.id &&
                this.grade == student.grade;
    }
}
