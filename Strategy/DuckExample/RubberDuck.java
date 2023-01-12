package Strategy.DuckExample;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new Squeak(), new NoFly(), new DisplayRubberDuck());
    }
    
}
