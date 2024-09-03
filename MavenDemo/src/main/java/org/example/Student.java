package org.example;

public class Student {
    private String name;
    private int age;

    private int grade;

    private String cnp;
    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade(){
        return grade;
    }

    public void setCnp(String cnp){
        this.cnp = cnp;
    }

    public String getCnp(){
        return cnp;
    }

    public String toString() {
        return "Student [ name: " + name + ", age: " + age+  ", grade: " + grade + ", cnp: " + cnp + "]";
    }
}
