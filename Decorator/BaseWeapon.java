package Decorator;

public class BaseWeapon implements Weapon {
    @Override
    public String aim_and_fire() {
        return"Firing the base weapon ";
    }
}