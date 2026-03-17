package Aufgabe3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hallo Ich bin ein Taschenrechner und ich brauche zwei Zahlen Zahl 1 und Zahl 2 : ");
        Scanner sc = new Scanner(System.in);
        double Zahl1 = 0; double Zahl2 = 0;
        char operator;
        try {
             Zahl1 = sc.nextInt();
            System.out.println("Zahl 1 ist : " + Zahl1 + " Jetzt brauche Zahl 2 : ");
             Zahl2 = sc.nextInt();
             System.out.print("Zahl 2 ist : " + Zahl2 + " Jetzt brauche ich den Operator +,-,*,/ :");
             operator = sc.next().charAt(0);
             switch(operator){
                case '+':
                 addieren(Zahl1, Zahl2);
                 break;
                case '-':
                 subtrahieren(Zahl1,Zahl2);
                 break;
                case '*':
                 multiplizieren(Zahl1, Zahl2);
                 break;
                case '/':
                    if(Zahl1 == 0 || Zahl2 == 0){
                        System.out.println("Fehler: Division durch Null ist nicht erlaubt!");
                    }else{
                        teilen(Zahl1, Zahl2);
                    }
                 break;
                default: 
                   System.out.println("Unbekannter Operator!");
             }

        } catch (Exception e) {
            System.out.println("Ups, da ist etwas schiefgelaufen! Bitte nur Ziffern eingeben.");
        }
        sc.close();
    }


    public static void addieren(double Zahl1,double Zahl2){
        System.out.println("Ergebnis: " + (Zahl1 + Zahl2));
    }
    public static void subtrahieren(double Zahl1,double Zahl2){
        System.out.println("Ergebnis: " + (Zahl1 - Zahl2));
    }
    public static void multiplizieren(double Zahl1,double Zahl2){
        System.out.println("Ergebnis: " + (Zahl1 * Zahl2));
    }
    public static void teilen(double Zahl1,double Zahl2){
        System.out.println("Ergebnis: " + (Zahl1 / Zahl2));
    }
}
