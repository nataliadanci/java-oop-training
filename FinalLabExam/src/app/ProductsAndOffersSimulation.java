package app;

import java.util.ArrayList;
import java.util.List;

public class ProductsAndOffersSimulation {
    public static void main(String[] args){
        Product product1 = new Product("Milk",9.80);
        Product product2 = new Product("Cheese", 4.50);
        Product product3 = new Product("Ham",6.70);
        Product product4 = new Product("Yogurt",2.30);
        Product product5 = new Product("Shampoo",12.70);
        Product product6 = new Product("Hand Soap", 14.20);
        Product product7 = new Product("Tuna",-10.30);

        //add products to the database
        ProductService productService = new ProductService();
        productService.create(product1);
        productService.create(product2);
        productService.create(product3);
        productService.create(product4);
        productService.create(product5);
        try{
            productService.create(product6);
        } catch (ValidationFailedException exception){
            System.out.println("Product6 was not saved. The reason is: " + exception.getMessage());
        }

        try{
            productService.create(product7);
        } catch (ValidationFailedException exception){
            System.out.println("Product7 was not saved. The reason is: " + exception.getMessage());
        }


        List<Product> productList1 = new ArrayList<>();
        productList1.add(product1);
        productList1.add(product2);
        productList1.add(product3);

        List<Product> productList2 = new ArrayList<>();
        productList2.add(product2);
        productList2.add(product4);
        productList2.add(product5);
        productList2.add(product6);

        List<Product> productList3 = new ArrayList<>();
        productList3.add(product2);
        productList3.add(product3);

        List<Product> productList5 = new ArrayList<>();
        productList5.add(product6);

        List<Product> productList6 = new ArrayList<>();
        productList6.add(product1);
        productList6.add(product6);

        Offer offer1 = new Offer("Daniel");
        offer1.setProducts(productList1);
        Offer offer2 = new Offer("Dana");
        offer2.setProducts(productList2);
        Offer offer3 = new Offer("Ioana");
        offer3.setProducts(productList3);
        Offer offer4 = new Offer("Cristina");
        offer4.setProducts(new ArrayList<>());
        Offer offer5 = new Offer("Alina");
        offer5.setProducts(productList5);
        Offer offer6 = new Offer("Claudia");
        offer6.setProducts(productList6);

        //add offer to database
        OfferServiceImpl offerService = new OfferServiceImpl();
        offerService.create(offer1);
        offerService.create(offer2);
        offerService.create(offer3);
        try{
            offerService.create(offer4);
        } catch(ValidationFailedException exception){
            System.out.println("Offer4 was not added to the database. The reason is: "
                    + exception.getMessage());
        }
        offerService.create(offer6);

        System.out.println("The number of successfully created offers is: " + offerService.findAll().size());

        //find the offers for which the associated customer name starts with the string "Dan"
        List<Offer> foundOffers = offerService.search("Dan");
        System.out.println("There are " + foundOffers.size() +
                " offers for which the customer name starts with the given value" );

        //delete offer1
        offerService.delete(offer1);
        System.out.println("Number of offers after deleting offer1 is: " + offerService.findAll().size());
        try{
            offerService.delete(offer5);
        } catch (OfferNotFoundException  exception){
            System.out.println("Offer5 was not deleted. The reason is: " + exception.getMessage());
        }

        List<Offer> offersWithCheese = offerService.findAllByProductName("Cheese");
        List<Offer> offersWithHandSoap = offerService.findAllByProductName("Hand soap");
        System.out.println("The number of offers with the product Cheese is: " + offersWithCheese.size());
        System.out.println("The number of offers with the product Hand soap is: " + offersWithHandSoap.size());

        for(Offer offer : offersWithCheese){
            System.out.println("The total price of the products for the offer with Cheese is: " + offer.getTotalPrice());
        }

    }
}
