package Decorator;

public class Flash extends WeponAccesory {

    public Flash(Weapon _weapon) {
        super(_weapon);
    }

    @Override
    public String aim_and_fire() {
        return baseweapon.aim_and_fire()+ " Flash";
    }

}
