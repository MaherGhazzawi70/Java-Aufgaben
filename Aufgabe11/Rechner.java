package Aufgabe11;

import java.util.Scanner;

public class Rechner{
 public static void main(String[] args) {
    System.out.println("Bruttopreis eingeben: ");
    Scanner scanner = new Scanner(System.in);
    double bruttoZahl = scanner.nextDouble();
    System.out.println("Steuersatz eingeben (%): ");
    double prozentsatz = scanner.nextDouble();
    double steuerbetrag = bruttoZahl * prozentsatz / (100 + prozentsatz);
    double Nettopreis = bruttoZahl - steuerbetrag;
    System.out.println("Steuerbetrag: " + String.format("%.2f", steuerbetrag));
    System.out.println("Nettopreis: " + String.format("%.2f", Nettopreis));
    scanner.close();
 }
}