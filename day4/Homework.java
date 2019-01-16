package pl.sda.javastart.day4;

import pl.sda.javastart.day3.ArraysExample;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        System.out.println(reversedArray(new int[]{1, 2, 3}));
        System.out.println(Arrays.toString(reversedArray(new int[]{1, 2, 3})));
        getAndPrint(4);
    }

    public static int[] reversedArray(int[] tab) {
        int lenght = tab.length;
        int[] tabResult = new int[lenght];
        for (int i = lenght; i > 0; i--) {
            tabResult[lenght - 1] = tab[i - 1];
        }
        return tabResult;
    }

    public static void getAndPrint(int howMany) {
        Scanner scanner = new Scanner(System.in);
        int[] tabForNumbers = new int[howMany];
        for (int i = 0; i < howMany; i++) {
            System.out.println("Podaj liczbe: " + i + ":");
            tabForNumbers[i] = scanner.nextInt();
        }
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < howMany; i++) {
            sum = tabForNumbers[i] + sum;
        }
        avg = sum / howMany;
        System.out.println("Suma rowna sie " + sum + "\n" + "Srednia rowna sie " + avg);
        int[] tabForMinMax = ArraysExample.calculateMinAndMax(tabForNumbers);
        System.out.println("Minimalna wartosc to " + tabForMinMax[0] + "\n" + "Maksymalna wartosc to " + tabForMinMax[1]);


    }

    }

