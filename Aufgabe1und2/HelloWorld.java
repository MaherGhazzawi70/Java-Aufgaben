package Aufgabe1und2;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
        sagHallo();

    }

    public static void sagHallo() {
        System.out.println("Hallo wie heißt du ?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        sc.close();
    }
}
