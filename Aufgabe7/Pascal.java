package Aufgabe7;
import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib die Anzahl der Zeilen ein: ");
        int grad = scanner.nextInt();
        int[][] dreieck = new int[grad][];
        for (int i = 0; i < grad; i++) {
            dreieck[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    dreieck[i][j] = 1;
                } else {
                    dreieck[i][j] = dreieck[i - 1][j - 1] + dreieck[i - 1][j];
                }
            }
        }

        for (int i = 0; i < grad; i++) {
            
            for (int s = 0; s < grad - i; s++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(dreieck[i][j] + "   ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
