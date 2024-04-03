import java.util.Arrays;

public class CompareToDemo {
    public static void main(String[] args){
        House house1 = new House(1974, 110,"Cristina","Motilor");
        House house2 = new House(1998,250,"Adelina","Eroilor");
        House house3 = new House(2013,90,"Valentin","Soporului");
        House[] array = new House[]{ house1, house2, house3 };
        System.out.println("Vectorul initial:");
        printArray(array);
        Arrays.sort(array);
        System.out.println("Vectorul dupa sortare:");
        printArray(array);
    }
    public static void printArray(House[] array){
        for(House h: array){ // alternativ for(int i=0;i<3;i++){ System.out.println(array[i])
            System.out.println(h); // echivalent cu h.toString()
        }
    }
}

