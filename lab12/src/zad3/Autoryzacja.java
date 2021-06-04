package zad3;

public class Autoryzacja {
    private State autoryzacjaUdana;
    private State autoryzacjaNieudana;
    private State sprawdzLogin;
    private State autoryzacjaZablokowana;
    private State state;

    public Autoryzacja(){
        this.autoryzacjaUdana = new AutoryzacjaPoprawnaStan(this);
        this.autoryzacjaNieudana = new AutoryzacjaNiepoprawnaStan(this);
        this.sprawdzLogin = new SprawdzLoginStan(this);
        this.autoryzacjaZablokowana = new AutoryzacjaNiepoprawnaStan(this);
        this.state = this.sprawdzLogin;
    }

    public void setState(State state) {
        this.state = state;
    }
    public State getState(){
        return this.state;
    }
    public State getSprawdzLogin(){
        return this.sprawdzLogin;
    }

    public State getAutoryzacjaUdana() {
        return autoryzacjaUdana;
    }

    public State getAutoryzacjaNieudana() {
        return autoryzacjaNieudana;
    }

    public State getAutoryzacjaZablokowana() {
        return autoryzacjaZablokowana;
    }

    public void sprawdzLogin(String login, String password){
        this.state.CheckLogin(login,password);
    }
}
