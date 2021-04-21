package zad1;

public class PaczkomatFabryka {

    protected Order deliverWayPaczkomat(){
        return new Paczkomat();
    }
    private String preparePaczka(String name){
        System.out.println("Paczka " + name+ " została przygotowana");
        return name;
    }

    public void SendPaczka(String name){
        String paczka = preparePaczka(name);
        Order deliver = deliverWayPaczkomat();
        deliver.deliver(paczka);
    }
}
