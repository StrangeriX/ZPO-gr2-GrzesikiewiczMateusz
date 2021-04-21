package zad1;

public class Main {
    public static void main(String[] args) {
        PaczkomatFabryka paczkomat = new PaczkomatFabryka();
        PocztaFabryka poczta = new PocztaFabryka();


        paczkomat.SendPaczka("Paczuszka");
        poczta.SendPaczka("Wielka paka");
    }
}
