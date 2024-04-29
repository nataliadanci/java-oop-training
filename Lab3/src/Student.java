public class Student {
    private String name;
    private int grade;
    private int id;
    private String cnp;

    public Student(String name, int grade, int id, String cnp){
        this.name = name;
        this.grade = grade;
        this.id = id;
        this.cnp = cnp;
    }

    public boolean equals(Object object){
        // clasa Object este clasa parinte pt toate clasele, inclusiv pt Student
        Student student = (Student)  object;
        return this.name == student.name &&
                this.grade == student.grade &&
                this.id == student.id &&
                this.cnp == student.cnp;
    }
}
