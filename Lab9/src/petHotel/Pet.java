package petHotel;

import map.Car;

import java.util.Objects;

public class Pet {
    private String name;
    private String owner;

    public Pet(String name,String owner){
        this.name = name;
        this.owner = owner;

    }
     @Override
    public String toString(){
        return name + ", belongs to " + owner;
    }

    @Override
    public boolean equals(Object o){
        Pet pet = (Pet) o;
        return this.name.equals(pet.name) &&
                this.owner.equals(pet.owner);
    }

    @Override
    public int hashCode(){
        String builtString = name + owner;
        return builtString.hashCode();
    }
}
