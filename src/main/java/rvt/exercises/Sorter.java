package rvt.exercises;

import java.util.Arrays;

public class Sorter {
     public static int smallest(int[] intArr) {
        int smallest = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] < smallest) {
                smallest = intArr[i];
            }
        }
        return smallest;

    }

    public static int indexOfSmallest(int[] intArr){
        int smallest = smallest(intArr);
        int indexOfSmallest = -1;
        for (int i = 0; i < intArr.length - 1; i++) {
            if (smallest == intArr[i]) {
                indexOfSmallest = i;
                break;
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestInt = table[startIndex];
        int indexOfSmallestFrom = startIndex;

        for (int i = startIndex; i < table.length - 1; i++) {
            if (table[i] < smallestInt) {
                smallestInt = table[i];
                indexOfSmallestFrom = i;
            }
        }
        return indexOfSmallestFrom;
    }

    public static void swap(int[] array, int index1, int index2) {
        for (int i = 0; i < array.length - 1; i++) {
            if (i == index1) {
                int tempInt = array[index1];
                array[index1] = array[index2];
                array[index2] = tempInt;
            }
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            
            int indexOfSmallestFrom = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfSmallestFrom);

            System.out.println(Arrays.toString(array));
        }
    }
}
