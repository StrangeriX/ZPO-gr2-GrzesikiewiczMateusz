package zad4;

public class Main {
    public static void main(String[] args) {
        PolishLanguage p = new PolishLanguage();
        FrenchLanguage f = new FrenchLanguage();
        BasicSub bs = new BasicSub(p, 50);
        StandardSub ss = new StandardSub(p, 100);
        PremiumSub ps = new PremiumSub(f, 500);

        bs.showNotification();
        ss.showNotification();
        ps.showNotification();

        bs.changeLanguage(f);
        bs.showNotification();
    }
}
