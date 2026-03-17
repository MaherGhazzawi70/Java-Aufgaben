package Aufgabe7;
import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Eingabe: Wie hoch soll das Dreieck sein?
        System.out.print("Gib die Anzahl der Zeilen ein: ");
        int grad = scanner.nextInt();

        // 2. Initialisierung: Das "Regal" mit 'grad' Stockwerken vorbereiten
        int[][] dreieck = new int[grad][];

        // 3. Verarbeitung: Zeile für Zeile befüllen
        for (int i = 0; i < grad; i++) {
            // Jedes Stockwerk i bekommt i+1 Zimmer (Spalten)
            dreieck[i] = new int[i + 1];

            for (int j = 0; j <= i; j++) {
                // Regel: Wenn ganz links (j=0) oder ganz rechts (j=i), setze eine 1
                if (j == 0 || j == i) {
                    dreieck[i][j] = 1;
                } else {
                    // Ansonsten: Summe aus den beiden Zahlen direkt darüber
                    dreieck[i][j] = dreieck[i - 1][j - 1] + dreieck[i - 1][j];
                }
            }
        }

        // 4. Ausgabe: Das Dreieck auf der Konsole anzeigen
        System.out.println("\nDein Pascalsches Dreieck:");
        for (int i = 0; i < grad; i++) {
            
            // Optional: Leerzeichen für die Pyramiden-Form
            for (int s = 0; s < grad - i; s++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(dreieck[i][j] + "   ");
            }
            System.out.println(); // Nächste Zeile
        }
        
        scanner.close();
    }
}
