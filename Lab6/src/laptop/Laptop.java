package laptop;

public class Laptop {

    //daca le facem private nu o sa fie vizibile in clasa copil
    // protected inseamna ca vizibilitatea e in acelasi pachet + in clasele copil
    protected String brandName;
    protected float price;
    protected String color;

    public Laptop(String brandName, float price, String color){
        this.brandName = brandName;
        this.price = price;
        this.color = color;
    }

    public Laptop(){

    }

    public String getBrandName(){
        return brandName;
    }

    public void printMessage(){
        System.out.println("I am a laptop");
    }
    public float getPrice(){
        return price;
    }
    public void setPrice(){
    }
}
