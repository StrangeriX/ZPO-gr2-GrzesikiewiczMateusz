package zad3;

public class Archer implements Class{
    WeaponStrategy weapon;

    public Archer(){
        this.weapon = new Bow();
    }
    public void display(){
        this.weapon.useWeapon();
    }
}
