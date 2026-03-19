package Aufgabe13;

public class Sekretaerin extends Angestellter {

    public Sekretaerin(String name, int gehalt) {
        super(name, gehalt);
        
    }

    @Override
    public double getMonthlyPay() {
        return gehalt;
    }
    
}
