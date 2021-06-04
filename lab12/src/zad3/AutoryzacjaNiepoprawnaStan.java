package zad3;

public class AutoryzacjaNiepoprawnaStan implements State{
    private Autoryzacja autoryzacja;
    public AutoryzacjaNiepoprawnaStan(Autoryzacja autoryzacja){
        this.autoryzacja = autoryzacja;
    }
    @Override
    public void CheckLogin(String login, String password) {
        System.out.println("Nieporwanie wprowadzono login lub hasło");
        autoryzacja.setState(autoryzacja.getSprawdzLogin());
    }
}
