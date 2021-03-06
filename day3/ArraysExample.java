package pl.sda.javastart.day3;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        int[] table = new int[5];
        tab[0] = 1;
        tab[1] = 2;
        tab[2] = 3;
        tab[3] = 4;
        tab[4] = 5;

        int[] anotherTable = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] emptyTable = new int[7];

        for (int i = 0; i < emptyTable.length; i++) {
            emptyTable[i] = i + 1;
        }
        System.out.println(emptyTable);
        printPrettyArray(emptyTable);
        System.out.println(Arrays.toString(emptyTable));

        System.out.println(calculateDifferenceBetweenMinAndMax(anotherTable));

        System.out.println(checkIfArraysAreSame(anotherTable, emptyTable));
        System.out.println(checkIfArraysAreSame(new int[]{1, 2, 3, 6}, new int[]{1, 2, 3, 6}));
        System.out.println(createArray(10));


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

    public static int calculateDifferenceBetweenMinAndMax(int[] entryTable) {
        int[] tabofmINANDmAX = calculateMinAndMax(entryTable);

        return Math.abs(tabofmINANDmAX[1] - tabofmINANDmAX[0]);
    }

    public static int[] calculateMinAndMax(int[] table) {
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



