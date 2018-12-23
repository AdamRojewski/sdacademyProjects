package pl.sda.javastart.day4;

import com.sun.tools.corba.se.idl.EnumGen;

import java.util.Scanner;

public class ForsExample2 {
    public static void main(String[] args) {
        printNumbersInTree(7);
        reverseTree(5);
        newTree(10);
        fibonacci(20);
        niepodzielnePrzez3(25);
        scenariusze("GR");
        silnia(6);

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
        System.out.println();
    }

    public static void niepodzielnePrzez3(int koniec) {
        int i = 0;
        while ((i++) < koniec) {
            if (i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void scenariusze(String kodJezyka) {
        switch (kodJezyka) {
            case "PL":
                System.out.println("Dzień dobry. Witam serdecznie");
                break;
            case "ENG":
                System.out.println("Good morning. Welcome!");
                break;
            case "FR":
                System.out.println("Bonne matin. Bienvenue!");
                break;
            case "DE":
                System.out.println("Guten Morgen. Herzlich Willkommen!");
                break;
            default:
                System.out.println("unavailable language");
                System.out.println("Good morning. Welcome!");
                break;
        }


    }

    public static void silnia(int n) {
        int silnia = 1;
        while (n > 1) {
            silnia = silnia * n;
            n = n- 1;

        }
        System.out.println(silnia);
    }
}






