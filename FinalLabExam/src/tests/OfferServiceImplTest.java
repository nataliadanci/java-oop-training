package tests;

import app.Offer;
import app.OfferServiceImpl;
import app.Product;
import app.ValidationFailedException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OfferServiceImplTest {

    @Test
    public void testCreateSuccessfully(){
        Offer offer1 = new Offer("Alina");
        Product product1 = new Product("Milk",9.40);
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        offer1.setProducts(productList);

        OfferServiceImpl offerService = new OfferServiceImpl();
        Offer offerCreated = offerService.create(offer1);

        assertEquals(1,offerService.findAll().size());
        assertEquals(offer1, offerCreated);
    }

    @Test
    public void testCreateOfferWithoutProductsThrowsException(){

        OfferServiceImpl offerService = new OfferServiceImpl();
        Offer offer = new Offer("Diana");

        Exception exception = assertThrows(ValidationFailedException.class, () -> {
            offerService.create(offer);
        });

        String expectedMessage = "Offer details are not valid";
        String actualMessage = exception.getMessage();

        assertEquals(0, offerService.findAll().size());
        assertEquals(expectedMessage,actualMessage);
    }


    @Test
    public void testCreateOfferWithoutCustomerThrowsException(){

    OfferServiceImpl offerService = new OfferServiceImpl();
    Offer offer = new Offer("");
    Product product = new Product("Ham",4.70);
    List<Product> productList = new ArrayList<>();
    productList.add(product);
    offer.setProducts(productList);

    Exception exception = assertThrows(ValidationFailedException.class, () -> {
        offerService.create(offer);
    });

    String expectedMessage = "Offer details are not valid";
    String actualMessage = exception.getMessage();

    assertEquals(0, offerService.findAll().size());
    assertEquals(expectedMessage,actualMessage);
    }
}
