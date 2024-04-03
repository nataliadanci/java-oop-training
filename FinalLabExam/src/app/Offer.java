package app;

import java.util.ArrayList;
import java.util.List;

public class Offer extends AbstractEntity {

    private String customer;
    private List<Product> products;

    public Offer(String customer){
        this.customer = customer;
        products = new ArrayList<>();
    }
    public String getCustomer(){
        return customer;
    }

    public void setProducts(List<Product> products){
        this.products = products;
    }

    public List<Product> getProducts(){
        return products;
    }

    public Double getTotalPrice(){
        Double total = 0.0;
        for(Product product : products){
            total += product.getPrice();
        }
        return total;
    }

}
