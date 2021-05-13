package zad3;

public class Main {
    public static void main(String[] args) {
        String miesiace[] = {"Styczen","Luty", "Marzec", "Kwiecien", "Maj", "Czerwiec", "Lipiec", "Sierpien", "Wrzesien", "Pazdziernik", "Listopad", "Grudzien"};
        for(String m: miesiace){
            System.out.println(m+": "+DaneFinansowe.getInstance(m).getValue());
        }
    }
}
