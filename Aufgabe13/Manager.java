package Aufgabe13;

public class Manager extends Angestellter {
    private boolean istmitglied;
    private boolean istfuhrungkrafrt;
    private boolean istmehralsZehnJahren;


    public Manager(String name, int gehalt, boolean mitglied, boolean fuhrungkrafrt, boolean mehralsZehnJahren) {
        super(name, gehalt);
        this.istmitglied = mitglied;
        this.istfuhrungkrafrt = fuhrungkrafrt;
        this.istmehralsZehnJahren = mehralsZehnJahren;
    }

    @Override
    public double getMonthlyPay() {
        int summeGehalt = this.gehalt;

        if(istmitglied) {
              summeGehalt += 200;
        }
        if(istfuhrungkrafrt){
            summeGehalt += 500;
        }
        if(istmehralsZehnJahren){
            summeGehalt += 1000;
        }

        return summeGehalt;
    }
    
}

