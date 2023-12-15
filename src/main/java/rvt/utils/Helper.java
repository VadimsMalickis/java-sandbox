package rvt.utils;

import java.util.Scanner;

public class Helper {

    public static final Scanner cliScanner = new Scanner(System.in);

    public static int askForInt() {
        return Integer.valueOf(cliScanner.nextLine());
    }
}
