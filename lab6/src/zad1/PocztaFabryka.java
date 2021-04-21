package zad1;

public class PocztaFabryka {
    protected Order deliverWayPoczta(){
        return new Poczta();
    }

    private String preparePaczka(String name){
        System.out.println("Paczka " + name+ " została przygotowana");
        return name;
    }

    public void SendPaczka(String name){
        String paczka = preparePaczka(name);
        Order deliver = deliverWayPoczta();
        deliver.deliver(paczka);
    }
}
