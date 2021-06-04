package zad3;

public class SprawdzLoginStan implements State{
    Autoryzacja autoryzacja;
    String login = "login";
    String password = "password";
    int tryCounter = 0;

    public SprawdzLoginStan(Autoryzacja autoryzacja){
        this.autoryzacja = autoryzacja;
    }

    @Override
    public void CheckLogin(String login, String password) {
        if(login == this.login && password == this.password){
            autoryzacja.setState(autoryzacja.getAutoryzacjaUdana());
            tryCounter = 0;
        }
        else if((login != this.login || password != this.password)&& tryCounter>3){
            autoryzacja.setState(autoryzacja.getAutoryzacjaNieudana());
            tryCounter++;
        }else{
            autoryzacja.setState(autoryzacja.getAutoryzacjaZablokowana());
        }
    }
}
