package zad3;

public class Knight implements Class{
    WeaponStrategy weapon;

    public Knight() {
        this.weapon = new SwordAndShield();
    }
    public void display(){
        this.weapon.useWeapon();
    }
}
