package serializable.house;

import java.io.Serializable;

public class House implements Serializable {

    private int constructionYear;
    private int numberOfRooms;
    private int numberOfFloors;
    private String address;
    private boolean isForSale;
    private boolean isForRent;
    private Person owner;

    public House(int constructionYear, int numberOfRooms, int numberOfFloors, String address, boolean isForSale, boolean isForRent, Person owner){
        this.constructionYear = constructionYear;
        this.numberOfRooms = numberOfRooms;
        this.numberOfFloors = numberOfFloors;
        this.address = address;
        this.isForSale = isForSale;
        this.isForRent = isForRent;
        this.owner = owner;
    }

    public String toString(){
        return constructionYear +
                " " + numberOfRooms +
                " " + numberOfFloors +
                " " + address +
                " " + isForSale +
                " " + isForRent +
                " " + owner.getName();
    }
}
