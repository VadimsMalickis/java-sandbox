package rvt;

import java.util.Scanner;

public class Sorter {

    public void mergeSort() {
        int[] intArr= {7,2,5,4,1,6,0,3};

        


    }


    public void drawTriangle() {
       Scanner scanner = new Scanner(System.in);
       int heigth = Integer.valueOf(scanner.nextLine());
       recursionDraw(heigth);
    }

    private void recursionDraw(int heigth) {
        if (heigth <= 0) {
            return;
        }
        recursionDraw(heigth - 1);
        for (int i = 0; i < heigth; i++) {
            System.out.print("#");
        }
        System.out.println();
    }

     private void draw(int heigth) {
         for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
         }
     }
}
