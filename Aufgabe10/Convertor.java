package Aufgabe10;

import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wahl = "";

        while (!wahl.equalsIgnoreCase("E")) {
            System.out.print("Z)eichen, O)ktal, heX), E)nde? ");
            wahl = sc.next().toUpperCase();

            switch (wahl) {
                case "Z":
                    convertfromZeichen(sc);
                    break;
                case "O":
                    convertfromOct(sc);
                    break;
                case "X":
                    convertfromHex(sc);
                    break;
                case "E":
                    System.out.println("Ende des Programms.");
                    break;
                default:
                    System.out.println("Ungültige Eingabe, nochmal versuchen.");
                    break;
            }
        }
        sc.close();
    }

    public static void convertfromZeichen(Scanner sc) {
        System.out.print("Zeichen eingeben: ");
        char zeichen = sc.next().charAt(0);
        int ascii = (int) zeichen;
        System.out.println("Dezimal: " + ascii);
        System.out.println("Binär:   " + Integer.toBinaryString(ascii));
    }

    public static void convertfromOct(Scanner sc) {
        System.out.print("Oktalzahl eingeben: ");
        String oktal = sc.next();
        int vonOktal = Integer.parseInt(oktal, 8);
        System.out.println("Dezimal: " + vonOktal);
        System.out.println("Binär:   " + Integer.toBinaryString(vonOktal));
    }

    public static void convertfromHex(Scanner sc) {
        System.out.print("Hexzahl eingeben: ");
        String hex = sc.next();
        int vonHex = Integer.parseInt(hex, 16);
        System.out.println("Dezimal: " + vonHex);
        System.out.println("Binär:   " + Integer.toBinaryString(vonHex));
    }
}
