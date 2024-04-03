package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductService implements AppService<Product>{

    private final ProductRepository productRepository;
    public ProductService(){
        productRepository = new ProductRepository();
    }
    public Product create(Product product){
        if(product.getPrice() <= 0){
            throw new ValidationFailedException("app.Product details are not valid, " +
                    "the price is negative or not set");
        }
        if(!product.getName().matches("[a-zA-Z]+")){
            throw new ValidationFailedException("app.Product details are not valid, " +
                    "the name is not correct");
        }
        return productRepository.create(product);
    }

    public List<Product> search(String value){
        Map<String,Product> productMap = productRepository.getProductMap();
        List<Product> productList = new ArrayList<>();
        for(Map.Entry<String,Product> pair : productMap.entrySet()){
            if(pair.getKey().startsWith(value)){
                productList.add(pair.getValue());
            }
        }
        return productList;
    }

    public boolean delete(Product product){
       try{
           productRepository.delete(product);
           return true;
       } catch (ProductNotFoundException exception){
           System.out.println("The product was not deleted because it was not found");
       }
       return false;
    }
}
