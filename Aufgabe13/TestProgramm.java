package Aufgabe13;

public class TestProgramm {
    public static void main(String[] args) {
        Manager m1 = new Manager("Chef Boss", 5000, true, true, true);
        Verkaeufer v1 = new Verkaeufer("Susi Sales", 2500, 800);
        Sekretaerin s1 = new Sekretaerin("Anna Archiv", 3000);

        Angestellter[] alleMitarbeiter = { m1, v1, s1 };

        System.out.println("=== FIRMEN ABRECHNUNG 2026 ===\n");
        for (Angestellter a : alleMitarbeiter) {
            System.out.println("Mitarbeiter: " + a.name); 
            System.out.println("Monatsgehalt: " + a.getMonthlyPay() + " Euro");
            System.out.println("Jahresgehalt: " + a.getYearlyPay() + " Euro");
            System.out.println("------------------------------");
        }
    }
}
