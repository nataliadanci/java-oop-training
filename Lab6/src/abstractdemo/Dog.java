package abstractdemo;

// se numeste clasa concreta pt ca nu e abstracta si putem crea obiecte
public class Dog extends Animal {

    private String race;

    public Dog(int age, String name, String race){
        super(age, name);
        this.race = race;
    }

    public String getName(){ // daca nu e implementat in clasa Dog nu compileaza clasa Dog
        return "dog " + name;
    }
}
