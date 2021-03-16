package zad3;

public class Gunner implements Class{
    WeaponStrategy weapon;

    public Gunner(){
        this.weapon= new Revolvers();
    }
    public void display(){
        this.weapon.useWeapon();
    }
}
