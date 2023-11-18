package rvt;

public class Stars {

    public static String star = "*";

    public static void main(String[] args) {
        printSquare(5);
    }

    private static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(star);
        }
        System.out.println();
    }
    public static void printSquare(int side) {
        for (int i = 0; i < side; i++) {
            printStars(side);
        }
    }

    public static void printRectangle(int sideA, int sideB) {
        for (int i = 1; i <= sideA; i++) {
            printStars(sideB);
        }
    }

    public static void printTriangle(int heigth) {
        for (int i = 1; i <= heigth; i++) {
            printStars(i);
        }
    }
}
