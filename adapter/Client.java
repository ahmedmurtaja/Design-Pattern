package adapter;

public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        ITargetInterface adapter = new Adapter(adaptee);
        adapter.method1();
        adapter.method2();
        
    }
    
}
