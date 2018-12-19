package pl.sda.javastart.day4;

import java.util.Scanner;

public class ForsExample2 {
    public static void main(String[] args) {
        printNumbersInTree(5);
        reverseTree(5);
        newTree(10);
        fibonacci(15);
    }

    public static void printNumbersInTree(int height) {
        for (int i = 0; i < height; i++) { // odpowiada za ilosc wierszy
            for (int j = 0; j <= i; j++) { // ilosc kolumn
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

    public static void reverseTree(int wysokosc) {
        for (int i = 0; i < wysokosc; i++) {
            for (int j = wysokosc; j > i; j--)
                System.out.print(" ");

            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

    public static void newTree(int wysokosc) {
        for (int i = 0; i < wysokosc; i++) {
            for (int k = wysokosc; k > i; k--) {
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            for (int j = wysokosc; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void fibonacci(int end) {
        int i = 0;
        int number1 = 0;
        int number2 = 1;
        while (i <= end) {
            System.out.print(number1 + " ");
            int sumOfPrevTwo = number1 + number2;
            number1 = number2;
            number2 = sumOfPrevTwo;
            i++;


        }
    }
}





