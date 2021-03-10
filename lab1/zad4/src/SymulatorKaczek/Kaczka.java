package SymulatorKaczek;

import latanie.LatanieStrategy;
import kwakanie.KwakanieStrategy;
public class Kaczka {
    public String nazwa;
    LatanieStrategy latanie;
    KwakanieStrategy kwakanie;

    public Kaczka(String nazwa, LatanieStrategy latanie, KwakanieStrategy kwakanie){
        this.nazwa = nazwa;
        this.latanie = latanie;
        this.kwakanie = kwakanie;
    }

    public void setLatanieStrategy(LatanieStrategy latanie) {
        this.latanie = latanie;
    }
    public void setKwakanieStrategy(KwakanieStrategy kwakanie){
        this.kwakanie = kwakanie;
    }

    public void latanie(){
        if(this.latanie == null) return;

        latanie.latanie();
    }

    public void kwakanie(){
        if(this.kwakanie == null) return;

        kwakanie.kwakanie();
    }
}