package pl.sda.javastart.day3;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};    //JEDEN SPOSÓB ZAPISANIA TABLICY
        int[] table = new int[5];            // DRUGI SPOSÓB

        table[0] = 1;
        table[1] = 2;
        table[2] = 3;
        table[3] = 4;
        table[4] = 5;

        int[] anotherTable = new int[]{1, 2, 3, 6, 5, 8};

        int[] emptyTable = new int[9];
        for (int i = 0; i < emptyTable.length; i++) {
            emptyTable[i] = i + 1;
        }
        System.out.println(emptyTable);
        printPrettyArray(emptyTable);
        System.out.println(Arrays.toString(emptyTable));   // drugie rozwiazanie !!

        System.out.println(calculateDifferenceBeetweenMinAndMax(anotherTable));
        System.out.println(checkIfArraysAreSame(anotherTable,emptyTable));



    }

    public static void printPrettyArray(int[] newTable) {
        String result = "[";
        for (int i = 0; i < newTable.length; i++) {
            if (i < newTable.length - 1) {
                result = result + newTable[i] + ", ";
            } else {
                result = result + newTable[i];
            }
        }
        result = result + "]";
        System.out.println(result);
    }

    public static int[] createArray(int size) {
        int[] table = new int[size];
        for (int i = 0; i < size; i++) {
            table[i] = i + 1;
        }
        return table;
    }

    public static int calculateDifferenceBeetweenMinAndMax(int[] entryTable) {
        int [] tabOfMinAndMax = calculateMinMax(entryTable);
        return Math.abs(tabOfMinAndMax[1] - tabOfMinAndMax[0]);
    }
    public static int[] calculateMinMax (int [] table) {


        int max = table[0];
        int min = table[0];

        for (int element : table) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }

        }
        int[] tabForMinMax = new int[]{min, max};
        return tabForMinMax;
    }

    public static boolean checkIfArraysAreSame(int[] firstArray, int[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        }
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }
        return true;
    }
}
