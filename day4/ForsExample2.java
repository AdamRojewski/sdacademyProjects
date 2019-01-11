package pl.sda.javastart.day4;

public class ForsExample2 {
    public static void main(String[] args) {
        printNumbersInTree(7);
        reverseTree(5);
        newTree(10);
        fibonacci(20);
        niepodzielnePrzez3(25);
        scenariusze("GR");
        silnia(6);
        System.out.println(checkIfpaired(2, 7));
        System.out.println(checkIfFirstAndSecondGivesThird(3, 2, 3));
        System.out.println(checkIfBiggerThanZero(-1, 2));
        System.out.println("Twoj mandat to " + policeman(70, true));
        prostokat(5, 8);
        potegowanieDo(2, 50);
        tabliczkMnozenia(10);
        System.out.println(addArrays(new int[7], new int[3]));
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
            n = n - 1;

        }
        System.out.println(silnia);
    }

    public static boolean checkIfpaired(int a, int b) {

        boolean result = a % 2 == 0 && b % 2 == 0;
        return result;
    }

    public static boolean checkIfFirstAndSecondGivesThird(int a, int b, int sum) {
        boolean result = a + b == sum;
        return result;
    }

    public static boolean checkIfBiggerThanZero(int a, int b) {
        boolean result = a > 0 || b > 0;
        return result;
    }

    public static String policeman(int predkosc, boolean ismood) {

        if (predkosc > 50 && predkosc <= 60 && !ismood) {
            return "100zl";
        } else if (predkosc > 50 && predkosc <= 65 && ismood) {
            return "100zl";
        } else if (predkosc > 60 && predkosc <= 70 && !ismood) {
            return "200zl";
        } else if (predkosc > 60 && predkosc <= 75 && ismood) {
            return "200zl";
        } else if (predkosc > 70 && !ismood) {
            return "300zl";
        } else if (predkosc > 75 && ismood) {
            return "300zl";
        } else return "0zl";

    }

    public static void prostokat(int wysokosc, int szerokosc) {
        for (int i = 0; i < szerokosc; i++) {
            System.out.print("X");
        }
        System.out.println();

        for (int i = 0; i < wysokosc - 2; i++) {
            System.out.print("Y");
            for (int j = 0; j < szerokosc - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("Z");

            System.out.println();
        }
        for (int i = 0; i < szerokosc; i++) {
            System.out.print("N");
        }
        System.out.println();

    }

    public static void potegowanieDo(int start, int koniec) {
        int potega = 1;
        double result;
        do {
            result = (Math.pow(start, potega));
            potega++;
            System.out.println(result);
        }
        while (result <= koniec);
    }

    public static void tabliczkMnozenia(int size) {
        System.out.format("      ");
        for (int i = 1; i <= size; i++) {
            System.out.format("%4d", i);
        }
        System.out.println();
        System.out.println("-----------------------------------------------");

        for (int i = 1; i <= size; i++) {
            System.out.format("%4d |", i);
            for (int j = 1; j <= size; j++) {
                System.out.format("%4d", i * j);
            }
            System.out.println();
        }
    }

    public static int[] addArrays(int[] firstArray, int[] secondArray) {
        for (int i = 0; i < firstArray.length; i++) {
        }
        return firstArray;

        for (int i = 0; i < secondArray.length; i++) {
        }
        return secondArray;

    }


}















