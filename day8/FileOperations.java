package pl.sda.javastart.day8;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {
    private static final String POV_TO_FILE = "/Users/adamrojewski/Documents/wiersz.txt";

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(POV_TO_FILE);
            BufferedReader bufferedReader = new BufferedReader(fileReader); // skrot ctr alt v na tworzenie zmiennej

            String line;
            List<String> lines = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) { // to jest sposob ktorego nie uzywamy, bo sa nowsze ale trzeba znac
                lines.add(line);
            }
            for (String s : lines) { // skrot iter
                String c = String.valueOf(s.charAt(0));
                String upperCased = c.toUpperCase(); // zamieniamy pierwsza litere na wielka
                String restofLine = s.substring(1);
                System.out.println(upperCased +restofLine);

                // StringUtils.capitalize(s) // rowniez zamienia pierwsza litere na wielka
            }

        } catch (IOException e) { // wystarczy IO exception , zeby inne np filenot found rowniez tam by;
            System.out.println(e.getMessage());
            //ABSOLUTNIE NIE ZOSTAWIAC PUSTEGO CATCHA !!
        }
    }
}
