package abstractdemo;

public class Demo {
    public static void main(String[] args){
        //Animal animal = new Animal(5,"Brutus"); // nu putem crea obiecte din clase abstracte
        Dog dog = new Dog(7,"Joe","pichinez");

        //System.out.println(animal.getName()); // nu am fi putut apela getName pe obiectul animal
                                                // pt ca este abstracta si nu are implementare
        System.out.println(dog.getName());
    }
}
