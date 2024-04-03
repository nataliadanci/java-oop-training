package staticexamples;

public class Student {
    public String name;
    public int age;
    public static String cnp = "0000";

    public Student(String name, int age, String cnp){
        this.name = name;
        this.age = age;
        this.cnp = cnp;
    }

    public boolean isOver18(){
        return age>18;
    }

    public static String getCnp(){
        return cnp;
    }
}
