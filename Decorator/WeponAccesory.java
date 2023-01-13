package Decorator;

public abstract class WeponAccesory implements Weapon { // Weapon Decorator

    protected Weapon baseweapon;

    public WeponAccesory(Weapon weapon) {
        this.baseweapon= weapon;
        
    }
    @Override
    public String aim_and_fire()
    {
       return baseweapon.aim_and_fire();
    }
}

