package zad4;
//singleton z bezpieczeństwem wątków i lazy loadingiem
public final class SingletonZbezpieczenstwemWatkow {
    private static volatile SingletonZbezpieczenstwemWatkow instance;

    private SingletonZbezpieczenstwemWatkow(){
    }

    public static synchronized SingletonZbezpieczenstwemWatkow getInstance(){
        if(instance == null){
            instance = new SingletonZbezpieczenstwemWatkow();
        }
        return  instance;
    }
}
