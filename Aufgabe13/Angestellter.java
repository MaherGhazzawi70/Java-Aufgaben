package Aufgabe13;

public abstract class Angestellter {
   protected int gehalt;
   protected String name;

   public Angestellter(String name, int gehalt){
      this.name = name;
      this.gehalt = gehalt;
   }
   public abstract double getMonthlyPay();

   public double getYearlyPay(){
    return getMonthlyPay() * 12;
   }
}

