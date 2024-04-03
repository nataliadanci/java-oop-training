package cloning;

import java.io.Serializable;

// Cloneable: Marker Interface
//o interfata marker este o interfata care nu are nici o metoda declarata, dar care marcheaza clasa
//ca fiind eligibila pentru o anumita operatie
public class Employee implements Cloneable {

    private String firstName;
    private String lastName;
    private int age;

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    // mereu se implementeaza asa metoda clone daca clasa are doar atribute primitive
    // (nu tipuri clase precum Matrice,Masina,Casa,etc)
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //apeleaza metoda clone din Object care e deja implementata
    }
}
