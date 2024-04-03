package comparable.demo;

public class Student implements Comparable<Student> {
    private String nume;
    private String prenume;
    private int varsta;
    private float medie;

    public Student(String nume, String prenume, int varsta, float medie){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.medie = medie;
    }
    @Override
    public String toString(){
        return nume + " " + prenume + " " + varsta + " " + medie;
    }

    @Override
    public int compareTo(Student student) {
        if(this.varsta == student.varsta){
            return 0;
        }
        if(this.varsta<student.varsta){
            return 1;
        }
        return -1;
    }
}
