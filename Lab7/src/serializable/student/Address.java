package serializable.student;

import java.io.Serializable;

public class Address implements Serializable{
    String completeAddress;
    public Address(String completeAddress){
        this.completeAddress = completeAddress;
    }
    public String toString(){
        return completeAddress;
    }
}
