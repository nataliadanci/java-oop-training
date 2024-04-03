package deep.cloning.student;

public class Student implements Cloneable{

    private String firstName;
    private String lastName;
    private Masina masina;

    public Student(String firstName, String lastName, Masina masina){
        this.firstName = firstName;
        this.lastName = lastName;
        this.masina = masina;
    }

    public Masina getMasina(){
        return masina;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{

        Student studentClone = (Student) super.clone();
        Masina masinaClone =(Masina) masina.clone();
        studentClone.masina =  masinaClone;
        return studentClone;
    }
}
