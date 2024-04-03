package petHotel;

import map.Car;

import java.util.HashMap;
import java.util.Map;

public class PetHashMapDemo {
    public static void main(String[] args){
        Pet pet1 = new Pet("Sasha","John");
        Pet pet2 = new Pet("Milo","Diana");
        Pet pet3 = new Pet("Lucky","Daniela");
        Pet pet4 = new Pet("Spike","Ioana");
        Map<Pet,Integer> petsMap = new HashMap<>();

        petsMap.put(pet1,2);
        petsMap.put(pet2,7);
        petsMap.put(pet3,9);
        petsMap.put(pet4,10);

        System.out.println("The list of keys: ");
        for(Pet keyPet : petsMap.keySet()){
            System.out.println(keyPet);
        }

        Map<Pet,Reservation> petReservationMap = new HashMap<>();
        // -verifica cate animale stau minim 3 zile
        //-modifica tipul de camera (from small to big) pentru animale care stau mai mult de 5 zile
        //-sterge animlele care stau doar o zi pentru ca le a expirat perioada
        //-verifica daca sunt animale de la un anumit owner(true sau false)

    }
}
