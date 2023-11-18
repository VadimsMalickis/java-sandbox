package rvt;

import java.util.Scanner;

// Regular Expression can be used to search, edit or manipulate text
public class RegExp {
    private static Scanner scanner = new Scanner(System.in);

    private static String onlyLettersRegex = "^[a-zA-Z]+$";

    public static String getValidName(String userInput) {
        while (userInput.matches(onlyLettersRegex) == false) {
            System.out.println("Vārds jāsatur tikai burtus.");
            System.out.println("Ievādiet vārdu vēlreiz.");
            userInput = scanner.nextLine();
        }
        return userInput;
    }
}
