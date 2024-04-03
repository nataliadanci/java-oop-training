package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductFileReader {

    public static List<Product> readProducts(String filePath){
        List<Product> products = new ArrayList<>();
        BufferedReader reader;
        try{
            FileReader fileReader = new FileReader(filePath);
            reader = new BufferedReader(fileReader);
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                String[] productAttributes = line.split(", ");
                Double productPrice = Double.valueOf(productAttributes[1]);
                int productQuantity = Integer.parseInt(productAttributes[2]);
                boolean productHasDiscount = Boolean.parseBoolean(productAttributes[3]);
                Product newProduct = new Product(productAttributes[0],productPrice,productQuantity,productHasDiscount);
                products.add(newProduct);
                // read next line
                line = reader.readLine();
            }

        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
        return  products;
    }

    public static void main(String[] args){
        List<Product> productsReadFromFile = readProducts("resources/productList.txt");
        System.out.println("The number of products read from file: " + productsReadFromFile.size());
    }
}
