package tests;
import app.Product;
import org.junit.Test;
import app.ProductService;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProductServiceTest {

    @Test
    public void testSearchProductsFound(){
        ProductService productService = new ProductService();
        Product product1 = new Product("Milk",5.80);
        Product product2 = new Product("Ham",4.50);
        Product product3 = new Product("Cheese", 3.80);
        Product product4 = new Product("Milkshake",10.50);

        productService.create(product1);
        productService.create(product2);
        productService.create(product3);
        productService.create(product4);

        List<Product> actualFoundProducts = productService.search("Milk");
        List<Product> expectedProducts = List.of(product1,product4);

        //assertEquals() when used for lists also checks that the objects are in the same order in both lists,
        //and we don't always care about the order when we check equality
        //assertEquals(expectedProducts,actualFoundProducts);

        assertTrue(expectedProducts.size() == actualFoundProducts.size() &&
                expectedProducts.containsAll(actualFoundProducts) && actualFoundProducts.containsAll(expectedProducts));
    }

    @Test
    public void testSearchNoProductsFound(){
        ProductService productService = new ProductService();
        Product product1 = new Product("Milk",5.80);
        Product product2 = new Product("Ham",4.50);
        Product product3 = new Product("Cheese", 3.80);

        productService.create(product1);
        productService.create(product2);
        productService.create(product3);

        List<Product> actualFoundProducts = productService.search("Soap");

        assertEquals(emptyList(),actualFoundProducts);
    }
}
