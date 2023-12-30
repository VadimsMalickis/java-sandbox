package rvt.utils;

import java.util.ArrayList;
import java.util.Scanner;

import rvt.Product;

public class Helper {

    public static final Scanner cliScanner = new Scanner(System.in);

    public static int askForInt() {
        return Integer.valueOf(cliScanner.nextLine());
    }

    public static int binarySearch(ArrayList<Product> array, int id) {
        int startIndex = 0;
        int endIndex = array.size() - 1;

        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            
            if (array.get(middleIndex).getId() == id) {
                return middleIndex;
            }
            if (array.get(middleIndex).getId() < id) {
                startIndex = middleIndex + 1;
            }
            if (array.get(middleIndex).getId() > id) {
                endIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
