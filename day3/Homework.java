package pl.sda.javastart.day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {

        int[] tab = new int[]{1, 2, 3, 4, 5};
        int reverse[] = new int[tab.length];
        for (int j = 0; j < tab.length; j++) {
            for (int i = tab.length; i > 0; i--) {
                reverse[j] = tab[i];
                i--;
            }
        }
        System.out.println(Arrays.toString(reverse));

    }
    public static void fiveNew(int[] newTable) {
        for (int i = 0; i < newTable.length; i++) {
        }
        int suma = 0;
        int a = suma / newTable.length;
        System.out.println("Suma elementów tablicy: " + suma);
        System.out.println("Średnia arytmetyczna elementów tablicy to: " + a);

}
}
