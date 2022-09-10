package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // imi afiseaza ce am pe prima linie din file.txt
        // checked exception
        // - orice clasa care mosteneste Exception este o clasa checked (asta mosteneste IOException)
        // sunt obligat sa ii fac try catch
        // exc. checked NU se intampla din vina programatorului - nu ai cum sa previi exceptia
        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int a1 = 5;
        int a2 = 0;
        //unchecked exception
        // arithmetic exception extinde runtime exception
        // orice exceptie care extinde runtime exception este o exceptie unchecked
        // pot fi prevenite folosind codul
        if(a2 !=0) // asa am prevenit exceptia
            System.out.println(a1 / a2);

    }
}
