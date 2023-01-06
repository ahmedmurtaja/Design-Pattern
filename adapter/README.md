 ## Adapter Design Pattern 

### Definition:

The Adapter Pattern ``converts`` the interface of a class 
into another interface ``the clients expect``. Adapter lets 
classes work together that couldn’t otherwise because of 
``incompatible interfaces``.

### Class Diagram :

![](https://lh6.googleusercontent.com/aI8llem2SDjjd_E9xFG7s90uzXuWhOwRfpMupaqCtAdrHVAIegnTB396FaJ04wkndcBTaXCJaMwg8cP8cec5oVh38mI5zwr_x0_cC9X9HpNUsP8LPSzt0l7rVc09LgLYdGAT5j91XOt-ZUT66oXnQSkdSrBUt4QQXJVycWJW47txSXalRMck9RrXQ-Rn2A)

Let's make things more clear!

### What are the main components of the Adapter Design Pattern?
1. **Target interface**: the interface that the client expect
2. **Adapter** : an intermediary class that converts the interface of one class into another class.
3. **Adaptee** : the interface we want to work with (deal with / access it).

### What kind of relations between parts of the adapter
- Adapter class ``implements`` ITargetInterface and override its methods
- Adapter class `` has an `` Instance of Adaptee class (composition)

> we use the instance of Adaptee to access its specific methods

```java

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

```

### How to implement Adapter Design Pattern : 
1. Identify the interface expected by the client class (the Target interface).
2.Create a class (the Adaptee class) that has a method with a different interface than the one expected by the client.
3.Create an Adapter class that implements the Target interface and has a reference to an instance of the Adaptee class.
4.The Adapter class should delegate method calls from the Target interface to the Adaptee class's method.
5.The client class should work with the Target interface, and the Adapter class should be used to instantiate the Adaptee class and provide the appropriate interface for the client.


