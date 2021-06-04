package zad3;

public class AutoryzacjaPoprawnaStan implements State{
    public AutoryzacjaPoprawnaStan(Autoryzacja autoryzacja){

    }

    @Override
    public void CheckLogin(String login, String password) {
        System.out.println("Witamy w systemie");
    }
}
