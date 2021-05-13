package zad4;

public class SingletonNaiwny {
    private static final SingletonNaiwny instance = new SingletonNaiwny();

    private SingletonNaiwny(){
        //prywatny konstruktor
    }
    public static SingletonNaiwny getInstance(){
        return instance;
    }
}
