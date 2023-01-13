package Decorator;

public class Main {
    public static void main(String[] args) {
        Weapon weapon = new BaseWeapon();
        System.out.println(weapon.aim_and_fire());
        Weapon weapon2 = new Flash(new Sniper(weapon));
        System.out.println(weapon2.aim_and_fire());
    }
}
