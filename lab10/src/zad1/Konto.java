package zad1;

import java.util.ArrayList;

public class Konto {
    private double stanKonta = 0;
    private ArrayList<Operacja> operacje = new ArrayList<Operacja>();

    public Konto(double stanKonta){
        this.stanKonta = stanKonta;
    }
    public void wplac(double value){
        this.stanKonta += value;
    }
    public void wyplac(double value){
        this.stanKonta -= value;
    }
    public void wykonaj(Operacja operacja){
        operacja.wykonaj();
    }
    public void addOperacje(Operacja operacja){
        operacje.add(operacja);
    }
    public void wykonaj(){
        for(Operacja operacja:operacje){
            operacja.wykonaj();
        }
        operacje.clear();
    }
    public double saldo(){
        return this.stanKonta;
    }
}
