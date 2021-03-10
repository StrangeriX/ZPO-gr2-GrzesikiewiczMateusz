package SymulatorKaczek;

import java.util.ArrayList;
import kwakanie.KwakanieStrategy;
import latanie.LatanieStrategy;

public class SymulatorKaczek {
    private ArrayList<Kaczka> kaczki = new ArrayList<Kaczka>();

    private class Lata implements LatanieStrategy{
        public void latanie(){
            System.out.println("lata");
        }
    }
    private class NieLata implements LatanieStrategy{
        @Override
        public void latanie(){
            System.out.println("nie lata");
        }
    }
    private class RakietoweLatanie implements LatanieStrategy{
        @Override
        public void latanie(){
            System.out.println("Lot z turbo napędem rakietowym");
        }
    }

    private class Kwacze implements KwakanieStrategy {
        public void kwakanie() {
            System.out.println("Kwakanie");
        }
    }

    private class Gwizdze implements KwakanieStrategy{
        @Override
        public void kwakanie() {
            System.out.println("Gwizdanie");
        }
    }
    public SymulatorKaczek(){
        Kaczka kaczka1 = new Kaczka("Kaczuszka", new Lata(), new Kwacze());
        kaczki.add(kaczka1);

        Kaczka nielotKaczka = new Kaczka("Nielot Kaczucha", new NieLata(), new Kwacze());
        kaczki.add(nielotKaczka);

        Kaczka TurboKaczka = new Kaczka("Rakietowa gumowa kaczka", new NieLata(),new Gwizdze());
        kaczki.add(TurboKaczka);

        coKaczkaPotrafi();

        TurboKaczka.setLatanieStrategy(new RakietoweLatanie());
        TurboKaczka.latanie();

        coKaczkaPotrafi();

    }

    private void coKaczkaPotrafi() {
        for(var kaczka : kaczki){
            System.out.println("Kaczka "+ kaczka.nazwa);
            kaczka.latanie();
            kaczka.kwakanie();
        }
    }
}
