package pl.sda.javastart;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz pierwsza liczbe");
        double firstValue = scanner.nextDouble();
        System.out.println("Wprowadz druga liczbe");
        double secondValue = scanner.nextDouble();
        System.out.println("a+b=" + (firstValue + secondValue));
        System.out.println("a-b=" + (firstValue - secondValue));
        System.out.println("a-b=" + (firstValue * secondValue));
        System.out.println("a-b=" + (firstValue / secondValue));
        System.out.println(("wartosc bezwzgledna odejmowania a i b =" + Math.abs (firstValue - secondValue)));
        System.out.println("Wartosc maksymalna wynosi " + Math.max(firstValue, secondValue));
        System.out.println("Wartosc minimalna wysoni " + Math.min(firstValue,secondValue));
        System.out.println("Potega wynosi " +Math.pow(firstValue,secondValue));



    }
    }
