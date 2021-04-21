package zad3;

public class OrderList {
    private Fotel fotel;
    private Sofa sofa;
    private Stolik stolik;

    public OrderList(Order order){
        fotel = order.addFotel();
        sofa = order.addSofa();
        stolik = order.addStolik();
    }

    public void changeStyle(Order order){
        fotel = order.addFotel();
        sofa = order.addSofa();
        stolik = order.addStolik();
    }
    public void wyswietl(){
        System.out.println("Twoje zamówienie: ");
        fotel.wyswietl();
        stolik.wyswietl();
        sofa.wyswietl();
    }
}
