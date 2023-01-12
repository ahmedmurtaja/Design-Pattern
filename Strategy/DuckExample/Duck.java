package Strategy.DuckExample;

public abstract class Duck {
    IQuackBehaviour quackBehaviour;
    IFlyBehaviour flybehaviour;
    IDisplayBehaviour displaybehaviour;

    public Duck(IQuackBehaviour _quackBehaviour ,IFlyBehaviour _flybehaviour , IDisplayBehaviour _displaybehaviour)
    {
        this.quackBehaviour = _quackBehaviour;
        this.flybehaviour = _flybehaviour;
        this.displaybehaviour=_displaybehaviour;
    }

    // execute Strategy in Context 
    public void fly()
    {
        this.flybehaviour.fly();
    }

    // and so on for other behaviours fly, quack, display
    public void quack()
    {
        this.quackBehaviour.quack();
    }

    public void display()
    {
        this.displaybehaviour.display();
    }
}
