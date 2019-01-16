package pl.sda.javastart.day2;

public class Potegowanie {
    public static void main(String[] args) {
        int potega = 1;
        do {
            System.out.println(Math.pow(potega, 3));
            potega++;
        }
        while (potega <= 10);
    }

}
