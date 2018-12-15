package pl.sda.javastart.day2;

import java.util.Scanner;

public class Ocenianie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz liczbe punktow:");
        int punkty = scanner.nextInt();
        System.out.println("Twoja ocena to " + oceny(punkty));
    }

    public static String oceny (int punkty){
        if (punkty > 50 && punkty < 60) {
             return "2";
        } else if (punkty > 60 && punkty < 70) {
            return "3";
        } else if (punkty > 70 && punkty < 80) {
            return "4";
        } else if (punkty > 80 && punkty < 90) {
            return "5";
        } else if (punkty > 90 && punkty <= 100) {
            return "6";
        }
    else
        return "1";


    }}
