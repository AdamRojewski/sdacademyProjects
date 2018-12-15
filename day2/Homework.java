package pl.sda.javastart.day2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czesc. Jak sie czujesz?");
        String firstValue = scanner.next();
        System.out.println("Ciesze sie, ze czujesz sie " + firstValue);
        System.out.println("Jak masz na imie?");
        String secondValue = scanner.next();
        System.out.println("Ile masz lat?");
        String thirdValue = scanner.next();
        System.out.println("Adam Ty byku, masz " + thirdValue + " lat");
        System.out.println("Ile masz wzrostu (dokładnie!)?");
        double fourthValue = scanner.nextDouble();
        System.out.println("Adam, masz " + fourthValue + "cm wzrostu");
        System.out.println("A jak czujesz sie teraz?");
        System.out.println(firstValue);
        System.out.println("Cieszę się, że czujesz się " + firstValue + ".");
        System.out.printf("Printing simple integer: x = " + requestedWords(args));
        System.out.printf("\nFormatted to specific width: n = " + "%.4f%n", specialWidth(args));
        System.out.printf("\nFormatted to right margin: n = " + "%.4f%n", formatedNumber(args));
        double pi = Math.PI;
        System.out.printf("%.2f%n", pi);

    }

    public static int requestedWords(String[] args) {
        int x = 2 * 50;
        return (x);


    }

    public static double specialWidth(String[] args) {
        double x = 5.2;
        return (x);
    }

    public static double formatedNumber(String[] args) {
        double y = 2324435.3f;
        return (y);

    }
}

