package pl.sda.javastart.day2;

public class CounterToZero {

    public static void main(String[] args) {
        int liczba = 100;
        do {
            System.out.println(liczba);
            liczba--;
        }
        while (liczba >= 10);
        System.out.println("koniec");
    }}
