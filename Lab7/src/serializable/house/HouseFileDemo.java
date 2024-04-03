package serializable.house;
import java.io.*;

public class HouseFileDemo {
    public static void main(String[] args){

        Person owner1 = new Person("Daniel","Smith",38);
        Person owner2 = new Person("Amelia","Grey",45);
        Person owner3 = new Person("Taylor","Swift",30);

        House house1 = new House(1968,5,2,"Plopilor 32",true,false,owner1);
        House house2 = new House(1970,3,1,"Bd Decembrie 21",false,true,owner2);
        House house3 = new House(2001,10,3,"Soporului 23",false,false,owner3);

        House[] houses = new House[]{house1,house2,house3};
        String filename = "src/serializable/house/house.txt";
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            for(House house : houses){
                out.writeObject(house);
            }
            out.close();
            file.close();
        } catch (IOException exception){
            System.out.println("Exception while saving in the file");
            exception.printStackTrace();
        }

        try {

            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            for (int i=0;i<3;i++){
                House readHouse = (House) in.readObject();
                System.out.println(readHouse);
            }

            in.close();
            file.close();
        } catch (IOException | ClassNotFoundException exception ){
            System.out.println("Exception while reading in the file");
            exception.printStackTrace();
        }
    }
}
