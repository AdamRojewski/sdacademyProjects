package pl.sda.javastart.day4;

public class ForsExample2 {
    public static void main(String[] args) {
        printNumbersInTree(5);
        reverseTree(5);
        newTree(9);
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
    }





