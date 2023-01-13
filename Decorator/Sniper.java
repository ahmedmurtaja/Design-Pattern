package Decorator;

public class Sniper extends WeponAccesory {

    public Sniper(Weapon _weapon) {
        super(_weapon);

    }

    @Override
    public String aim_and_fire() {
        return baseweapon.aim_and_fire() +" With sniper ";
    }
}
