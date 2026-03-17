package Aufgabe4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        factorialcreator();
    }



    public static void factorialcreator(){
        long result = 1;
        System.out.println("Geben Sie mir einen Zahl und ich werde ihn die Fakultät geben");
        Scanner sc = new Scanner(System.in);
        int factorial = sc.nextInt();
        for(int i = 1; i <= factorial; i++){
             result *= i;
        }
        System.out.println(result);
        sc.close();
    }

}
