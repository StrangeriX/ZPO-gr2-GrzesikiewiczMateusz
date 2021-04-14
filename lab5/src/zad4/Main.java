package zad4;

public class Main {
    public static void main(String[] args) {
        OrderDecorator baseOrder = new BaseOrder(5);
        OrderDecorator mascot = new Mascot(baseOrder);
        OrderDecorator leash = new Leash(mascot);
        OrderDecorator discout = new Discount(leash);
        OrderDecorator transport = new Transport(discout);

        System.out.println("You have ordered: "+transport.getName());
        System.out.println("It costs: "+transport.getCost());
    }
}
