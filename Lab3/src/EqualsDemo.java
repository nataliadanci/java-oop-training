public class EqualsDemo {
    public static void main(String[] args) {

        Student student1 = new Student("Cristina", 10, 9, "12345678");
        Student student2 = new Student("Daniel", 18,7,"98765432");
        Student student3 = new Student("Cristina", 10, 9,"11111111");

        if(student1==student3){
            System.out.println("student1==student3");
        }else {
            System.out.println("NU");
        }

        if(student1==student2){
            System.out.println("student1==student2");
        }else {
            System.out.println("NU");
        }

        if(student1.equals(student3)){
            System.out.println("am verificat cu equals : student1==student3");
        }else{
            System.out.println("NU");
        }
    }
}