package pracownicy;

public class Pracownik {
    private DojedzacStrategy dojedzacStrategy;
    private PracowacStrategy pracowacStrategy;
    private SpedzanieWolnegoCzasuStrategy spedzanieWolnegoCzasuStrategy;

    public void setDojedzacStrategy(DojedzacStrategy a){
        this.dojedzacStrategy = a;
    }

    public void setPracowacStrategy(PracowacStrategy pracowacStrategy) {
        this.pracowacStrategy = pracowacStrategy;
    }

    public void setSpedzanieWolnegoCzasuStrategy(SpedzanieWolnegoCzasuStrategy spedzanieWolnegoCzasuStrategy) {
        this.spedzanieWolnegoCzasuStrategy = spedzanieWolnegoCzasuStrategy;
    }

    public void czymDojezdzam(){
        if(dojedzacStrategy == null) return;
        dojedzacStrategy.dojezdzaj();
    }

    public void jakSpedzamCzas(){
        if(spedzanieWolnegoCzasuStrategy == null)return;
        spedzanieWolnegoCzasuStrategy.spedzajCzasWolny();
    }
    public void coRobie(){
        if(pracowacStrategy == null)return;
        pracowacStrategy.pracuj();
    }

    public void display(){
        this.coRobie();
        this.czymDojezdzam();
        this.jakSpedzamCzas();
    }
}
