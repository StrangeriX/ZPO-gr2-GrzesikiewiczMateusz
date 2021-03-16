package zad2;

public class main {
    public static void main(String[] args) {
    DolbyDigital digital = new DolbyDigital();
    DolbyProLogic proLogic = new DolbyProLogic();


    Speakers mySpeakers = new Speakers(5, proLogic);
    mySpeakers.checkDolby();
    System.out.println("Zmieniamy");
    mySpeakers.setDolby(digital);
    mySpeakers.checkDolby();
    }
}
