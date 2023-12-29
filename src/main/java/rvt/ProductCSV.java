package rvt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ProductCSV {

    private static final InputStream is = ProductCSV.class.getResourceAsStream("/data/products.csv");
    private static final InputStreamReader isr = new InputStreamReader(is);


    public static ArrayList<Product> loadAllProducts() {
        // Create a List to store the CSV data
        ArrayList<Product> productList = new ArrayList<>();
        // Read each line of the CSV file
        String line;

        try (BufferedReader reader = new BufferedReader(ProductCSV.isr)) {
            // skip first line with header names
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                // Split the line on the comma delimiter
                String[] lineSplit = line.split(", ");

                Product product = new Product(Integer.valueOf(lineSplit[0]), lineSplit[1]);
                // Add the values to the List
                productList.add(product);
            }
        } catch (IOException e) {
            System.out.println("CSV file not found!");
        }

       return productList;
    }
}
