package pl.sda.javastart.day5;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamsExample {
    private static String[] animals = new String[]{"cat", "dog ", "mouse", "rat",
            "pig", "rabbit", "hamster", " ", "parrot", "cat", "",
            "dog", "cat", "  pig", "dog", null, "parrot"};

    public static void main(String[] args) {
        firstStream();
        secondStream();
        sortExample();

    }

    private static void firstStream() {
        // String [] unique
        for (String animal : animals) {
            if (animal == null) {
                continue;
            }
            animal = animal.trim();
            if (animal.length() >= 4) {
                // todo wymyslic unikalnosc
                System.out.println(animal);
            }
        }
        System.out.println("ponizej Stream");
        Arrays.stream(animals) // tu jest strumien Stringow.
                .filter(e -> e != null)
                .map(e -> e.trim())
                .distinct()
                .filter(e -> e.length() >= 4) // kazde "e" to obiekt typu String
                .forEach(e -> System.out.println(e)); // void nie zwraca, nie trzeba przypisywac do zmiennej
    }

    private static void secondStream() {
        for (String animal : animals) {
            if (animal == null) {
                continue;
            }
            System.out.print(animal + ","); // todo zrobic brak przecinka na koncu
        }
        System.out.println("# teraz stream");
        String result = Arrays.stream(animals)
                .filter(a -> StringUtils.isNotBlank(a)) // sprawdza czy nie jest blank / empty / null
                .map(e -> e.trim())
                .collect(Collectors.joining(",")); // dlaczego tutaj nie dodal przecinka ?? (metoda zwracajaca Stringa - trzeba przypisac do zmiennej)
        System.out.println(result);
        System.out.println();

    }

    private static void sortExample() {
        String name1 = "Anna";
        String name2 = "Ola";
        System.out.println(name1.compareTo(name2));
        System.out.println("Sortowanie alfabetyczne");
        Arrays.stream(animals)
                .filter(e -> StringUtils.isNotBlank(e))
                .map(e -> e.trim())
                .distinct()
                .sorted((e, f) -> e.compareTo(f))
                .forEach(e -> System.out.print(e + " "));
        System.out.println("Sortowanie po dlugosci nazwy");
        Arrays.stream(animals)
                .filter(e -> StringUtils.isNotBlank(e))
                .map(e -> e.trim())
                .distinct()
                .sorted((e, f) -> Integer.valueOf(e.length()).compareTo(Integer.valueOf(f.length())))
                .forEach(e -> System.out.print(e + " "));
    }
}
