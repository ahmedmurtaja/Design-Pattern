package Strategy.DuckExample;

public class DisplayRubberDuck implements IDisplayBehaviour {

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }

}
