package abstractdemo;

public abstract class Animal {

    protected int age;
    protected String name;

    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }
 //daca o clasa are o metoda abstracta trebuie sa definim si clasa ca fiind abstracta
    public abstract String getName(); // metoda abstracta nu are implementare
        // suntem obligati sa o implementam in clasa copil

}
