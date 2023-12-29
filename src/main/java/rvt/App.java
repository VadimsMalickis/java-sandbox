package rvt;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<Product> products = ProductCSV.loadAllProducts();

        System.out.println(products.size());
    }
}
