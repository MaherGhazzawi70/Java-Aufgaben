package Aufgabe5;
import java.util.Scanner;
public class Square {
    public static void main(String[] args){
         squareZeichen(5); // Teil 1
         squareUser(); // Teil 2
    }

    // Teil 1 : 
    public static void squareZeichen(int loop){
        for(int i = 0; i < 5; i++){
            for(int j = 1; j <= 5;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    // Teil 2
    public static void squareUser(){
        System.out.println("Schreiben Sie die Höhe an : ");
        Scanner sc = new Scanner(System.in);
        int hoher = sc.nextInt();
        System.out.println("Schreiben Sie die Breite an : ");
        int Breite = sc.nextInt();
        for(int i = 0; i < hoher;i++){
            for(int j = 0; j < Breite; j++){
               System.out.print("*");
            }
            System.out.println(" ");
        }
       sc.close();
    } 
}
