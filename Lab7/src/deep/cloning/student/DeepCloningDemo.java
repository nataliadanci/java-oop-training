package deep.cloning.student;

public class DeepCloningDemo {
    public static void main(String[] args){
        Masina masina1 = new Masina("Audi","blue");
        Student student1 = new Student("Daniel","Pop",masina1);


        try{
            Student studentClone = (Student) student1.clone();
            student1.getMasina().setColor("green");
            System.out.println("Color for student 1: " + student1.getMasina().getColor());
            System.out.println("Color for student 1: " + studentClone.getMasina().getColor());
        }catch(CloneNotSupportedException e){
            System.out.println("The student hasn't been cloned");
        }
    }
}
