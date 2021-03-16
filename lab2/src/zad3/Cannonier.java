package zad3;

public class Cannonier implements Class{
    WeaponStrategy weapon;

    public Cannonier(){
        this.weapon = new Cannon();
    }
    public void display(){
        this.weapon.useWeapon();
    }

}
