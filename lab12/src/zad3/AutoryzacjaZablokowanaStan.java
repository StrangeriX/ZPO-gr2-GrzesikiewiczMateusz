package zad3;

public class AutoryzacjaZablokowanaStan implements State{
    private Autoryzacja autoryzacja;
    public AutoryzacjaZablokowanaStan(Autoryzacja autoryzacja){
        this.autoryzacja = autoryzacja;
    }


    @Override
    public void CheckLogin(String login, String password) {
        System.out.println("Odczekaj 30s przed następną próbą");
    }
}
