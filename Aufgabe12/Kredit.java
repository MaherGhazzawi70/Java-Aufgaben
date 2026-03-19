package Aufgabe12;

import java.util.Scanner;

public class Kredit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie hoch ist die Kreditsumme: ");
        double geldbetrag = scanner.nextDouble();
        System.out.println("Wie hoch ist der Zinssatz: ");
        double zinssatz = scanner.nextDouble();
        double faktor = (100.0 + zinssatz) / 100;
        for(int i = 1; i <= 10; i++){
          geldbetrag = geldbetrag * faktor;
           System.out.println("Jahr " + i + " : " + String.format("%.2f",geldbetrag));

        }
        scanner.close();
    }
}
