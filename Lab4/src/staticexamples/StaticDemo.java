package staticexamples;

public class StaticDemo {
    public static void main(String[] args){
       Student student = new Student("Ionut", 16,"60345678921");
       System.out.println(student.isOver18());
       System.out.println(student.name);

       // afisare atribut de clasa static
        System.out.println(Student.cnp);

        //apel metoda statica
        System.out.println(Student.getCnp());
    }
}
