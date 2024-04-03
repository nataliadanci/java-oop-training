package app;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {

    private Map<String,Product> productMap;
    public ProductRepository(){
        productMap = new HashMap<>();
    }

    public Map<String, Product> getProductMap() {
        return productMap;
    }

    public Product create(Product product){
        productMap.put(product.getName(),product);
        return product;
    }

    public boolean delete(Product product) throws ProductNotFoundException{
        if(productMap.containsValue(product)){
            productMap.remove(product.getName());
            return true;
        }
        else {
            throw new ProductNotFoundException("app.Product to delete not found");
        }
    }

}
