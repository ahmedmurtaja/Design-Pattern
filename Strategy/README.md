## Strategy Design Pattern

### Definition:

Define a family of algorithms encapsualte each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

- Use the Strategy pattern when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.
- Use the Strategy pattern when you have a lot of ``similar classes`` that only differ in the way they execute some behavior.
- Use the Strategy pattern when you want to isolate the implementation details of a class from other objects.
- Use the Strategy pattern when you want to provide clients with different objects that perform the same task in different ways.
- Prefer `composition` over `inheritance` when you need to vary behavior at runtime.

### The Problem:

- We have a class that has a method that does a specific task.
- We want to add a new feature to this class, but we don't want to change the existing code.

### The Solution:
<div align="center">
<img src="https://blog.ankitsanghvi.in/content/images/2021/04/strat-cat.jpg">
</div>

### Class Diagram :

<div align="center">
<img src="https://media.geeksforgeeks.org/wp-content/uploads/classss.jpg">
</div>
### What are the main components of the Strategy Design Pattern?

- In Duck Example : Duck which is the Context class having several behaviuors (fly, quack, display) which are the ``Strategy classes``.
- In Duck Example : FlyWithWings, FlyNoWay, FlyRocketPowered, Quack, Squeak, MuteQuack, DisplayWithWings, DisplayNoWay, DisplayRocketPowered are the ``concrete strategies``.
- In Duck Example : IFlyBehavior, IQuackBehavior, IDisplayBehavior are the ``Strategy interfaces``.


### What kind of relations between parts of the strategy
- Context class ``has a`` reference to a Strategy interfaces.
- Concrete Strategies ``implement`` the Strategy interfaces.


```java

package strategy;

public class Context/*Duck*/ {
    private IStrategy strategy; /*FlyBehavior, QuackBehavior, DisplayBehavior*/

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int num1, int num2) { /*fly(), quack(), display()*/
        strategy.doOperation(num1, num2);
    }
}

```

### Duck Example

```java

package strategy;
class Duck {
IFlyBehavior flyBehavior;
IQuackBehavior quackBehavior;
IDisplayBehavior displayBehavior;

public Duck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior, IDisplayBehavior displayBehavior) {
this.flyBehavior = flyBehavior;
this.quackBehavior = quackBehavior;
this.displayBehavior = displayBehavior;
}
public void fly() {
flyBehavior.fly();
}
public void quack() {
quackBehavior.quack();
}
public void display() {
displayBehavior.display();
}
}

```

### How to implement Strategy Design Pattern :
1. Identify the common behavior between the classes that you want to change at runtime.
2. Create an interface with the common behavior.
3. Create concrete classes that implement the new interface.
4. Create a context class that will use a concrete class that implements the new interface.
5. The context class must have a setter to change the behavior at runtime.
