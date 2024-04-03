package app;

public class Product extends AbstractEntity{

    private String name;
    private Double price;
    private int quantity;
    private boolean hasDiscount;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }
    public Product(String name, Double price, int quantity, boolean hasDiscount){
        this(name, price);
        this.quantity = quantity;
        this.hasDiscount = hasDiscount;
    }
    public String getName(){
        return name;
    }
    public Double getPrice(){
        return price;
    }
}
