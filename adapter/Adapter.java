package adapter;

public class Adapter implements ITargetInterface {
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void method1() {
        adaptee.Specific_method1();
    }
    @Override
    public void method2() {
        adaptee.Specific_method2();
    }
    
}
