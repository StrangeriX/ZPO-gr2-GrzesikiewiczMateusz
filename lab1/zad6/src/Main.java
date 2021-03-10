import pracownicy.*;
public class Main {
    public static void main(String[] args){
        Pracownik Adam = new Pracownik();
        Adam.setDojedzacStrategy(new Rower());
        Adam.setPracowacStrategy(new RoznoszenieListow());
        Adam.setSpedzanieWolnegoCzasuStrategy(new Silownia());

        Adam.display();

    }
}
