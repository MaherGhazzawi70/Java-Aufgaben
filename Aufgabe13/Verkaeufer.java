package Aufgabe13;

public class Verkaeufer extends Angestellter {
    private int provision;

    public Verkaeufer(String name, int gehalt, int provision2) {
        super(name, gehalt);
        this.provision = provision2;
    }

    @Override
    public double getMonthlyPay() {
        return this.gehalt + provision;
    }
    
}
