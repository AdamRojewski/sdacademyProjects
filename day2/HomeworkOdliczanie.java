package pl.sda.javastart.day2;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HomeworkOdliczanie {
    public static void main(String[] args) {
        double fehrTemperature;
        double cTemperature;
        Scanner in = new Scanner(System.in);
        System.out.println("Wprowadz temperature w F:");
        fehrTemperature = in.nextInt();
        fehrTemperature = ((fehrTemperature - 32) * 5) / 9;

        System.out.printf("Temperatura w C wynosi: " + "%.2f%n", fehrTemperature);

        System.out.println("Wprowadz temperature w C: ");
        cTemperature = in.nextInt();
        cTemperature = (cTemperature * 9 / 5 + 32); // (9/5) * Celsius + 32;
        System.out.printf("Temperatura w F wynosi " + "%.2f%n", cTemperature);

        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int year = cal.get(Calendar.YEAR);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        System.out.println(hour + ":" + minute + " " + day + "." + month + "." + year);
        System.out.println((hour * 60) + minute);
        double wholeday = ((hour /24) *100); // hour / 24 * 100
        System.out.format("%.15f%n", wholeday); // nie umiem dodac % na koncu, nie liczy jesli jest polnoc...
        int leftMidnight = ((hour * 60 * 60) + (minute * 60));
        System.out.println(24 * 60 * 60 - leftMidnight);
        for (int x = 0; x < 4; ++x) ;
        powers(11, 11, 11, 4);


    }

    public static void powers(int a, int b, int c, int endNumber) {
        for (int x = 1; x < endNumber; ++x) {
            System.out.println(a + "^" + x + " " + b + "^" + ++x + " " + c + "^" + ++x);
        }


    }
}
