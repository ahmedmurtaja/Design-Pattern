## Decorator Pattern

### what is Decorator Pattern ?

- Decorator pattern is used to modify the functionality of an object at runtime.
- Decorator pattern is one of the ``structural`` design pattern and uses abstract classes or interfaces with composition to add additional functionality to an object dynamically.
- Decorator pattern is also known as Wrapper.
- Decorator pattern is used to add new functionality to an existing object without altering its structure.

### Class Diagram

<div align="center">
    <img src="https://sourcemaking.com/files/v2/content/patterns/Decorator_example.png" width="400" />
</div>



### What is the main component of Decorator Pattern ?
- Component : The interface or abstract class defining the operations that can be modified by the decorators.
- Concrete Component : The class that implements the component interface and defines the basic behavior that can be modified.
- Decorator : The abstract class that implements the component interface and has a field for storing a reference to a component object and the concrete decorator classes extend the decorator class and modify the component object’s behavior.
- Concrete Decorator : The class that extends the decorator class and modifies the component object’s behavior by adding state or adding behavior.
- Client : The class that uses the component and decorator objects.

### What kind of relation between Decorator and Component ?
- Decorator and Component have a ``has-a`` relationship.
- Decorator has a reference to a Component object.
- Decorator can be used to modify the behavior of the Component object.

### What kind of relation between Concrete Decorator and Decorator ?
- Concrete Decorator and Decorator have a ``is-a`` relationship.
- Concrete Decorator extends the Decorator class.


### What Kind of Problems Can Decorator Pattern Solve ?
- Decorator pattern is used to modify the functionality of an object at runtime.
- Decorator pattern is used to dynamically add a new feature to an object without affecting the behavior of other existing features of the object.
- Decorator pattern is used to add responsibilities to individual objects dynamically and transparently, that is, without affecting other objects.




### How To Implement Decorator Pattern ?'

1. Create an interface for the component that will have the operations to be decorated.
   > in pizza example, we have an interface **Pizza** with method getDescription() and getCost().

```java
public interface Pizza {
    String getDescription();
    double getCost();
}

```

- Create concrete component classes implementing the component interface.
  > in pizza example, we have a concrete class MargheritaPizza that implements the Pizza interface.

```java
public class MargheritaPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }

    @Override
    public double getCost() {
        return 6.0;
    }
}
```

- Create an abstract decorator class implementing the component interface and having a field to store a reference to a component object.
  > in pizza example, we have an abstract class ToppingDecorator that implements the Pizza interface and has a field to store a reference to a component object.

```java
public abstract class ToppingDecorator implements Pizza {
    protected Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza) {
        tempPizza = newPizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}
```

- Create concrete decorator classes extending the abstract decorator class. Each concrete decorator class overrides the methods of the abstract decorator class and executes its behavior either before or after calling the parent class method.
  > in pizza example, we have a concrete class CheeseTopping that extends the ToppingDecorator class.

```java
public class CheeseTopping extends ToppingDecorator {
    public CheeseTopping(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 1.0;
    }
}
```

- Client will use the component interface to interact with objects (both simple or decorated).
  > in pizza example, we have a client class PizzaMaker that uses the component interface to interact with objects.

```java
public class PizzaMaker {
    public static void main(String[] args) {
        Pizza basicPizza = new MargheritaPizza();
        System.out.println("Basic Pizza: " + basicPizza.getDescription() + " Cost: " + basicPizza.getCost());

        Pizza cheesePizza = new CheeseTopping(new MargheritaPizza());
        System.out.println("Cheese Pizza: " + cheesePizza.getDescription() + " Cost: " + cheesePizza.getCost());
    }
}
```

- Output

```
Basic Pizza: Margherita Pizza Cost: 6.0
Cheese Pizza: Margherita Pizza, Cheese Cost: 7.0
```
