package Aufgabe6;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Dreieck Höhe eingeben : ");
        Scanner sc = new Scanner(System.in);
        int Hohe = sc.nextInt();
       triangle(Hohe);
         System.out.println("Tannenbaum Höhe angeben : ");
         int TannenBaum = sc.nextInt();
         triangle(Hohe);
         for(int i = 0; i < TannenBaum; i++){
            for(int j = 0; j < Hohe - 1; j++){
                System.out.print(" ");
            }
            System.out.println("*");
         }
        sc.close();
    }

    public static void triangle(int Hohe){
        for (int i = 0; i < Hohe; i++) {

            for (int s = 0; s < Hohe - i - 1; s++) {
                System.out.print(" ");
            }
            int place = 2 * i + 1;
            for (int j = 0; j < place; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
