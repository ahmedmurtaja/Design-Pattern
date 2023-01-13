## iterator Design Pattern

### Definition:

The Iterator Pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation , it doesnt matter what an object structure is,all i need is an iterator.

- So we want to `encapsulate` the traversal of an aggregate object in an iterator object.
- iterator provieds you with uniform way to accss differernt collection

### Class Diagram :

<div align="center">
<img src="https://www.tutorialspoint.com/design_pattern/images/iterator_pattern_uml_diagram.jpg">
</div>



### How to implement iterator Design Pattern :

- Create an interface that defines the methods to access the elements of an aggregate object.

```java
package iterator;

public interface Iterator {
    boolean hasNext(); // check if there is a next element
    Object next(); // return the next element(object)
}
```

- Create a concrete class that implements the interface and provides the implementation of the methods.

```java
package iterator;

public class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate; // Aggregate is a Collection of objects
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        return current < aggregate.count();
    }

    @Override
    public Object next() {
        return aggregate.get(current++);
    }
}
```
- Create an interface that defines the methods to create an iterator object.

```java
package iterator;

public interface Aggregate {
    Iterator createIterator();
}
```
- Create a concrete class that implements the interface and provides the implementation of the methods.

```java
package iterator;

public class ConcreteAggregate implements Aggregate {
    private Object[] items = new Object[10];
    private int total = 0;

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count() {
        return total;
    }

    public Object get(int index) {
        return items[index];
    }

    public void add(Object item) {
        items[total++] = item;
    }
}
```
- Create a client class that uses the iterator to access the elements of the aggregate object.

```java
package iterator;

public class Client {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.add("item 1");
        aggregate.add("item 2");
        aggregate.add("item 3");
        aggregate.add("item 4");
        aggregate.add("item 5");

        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
```
- Output

```java
item 1
item 2
item 3
item 4
item 5
```

For Example:  Array iterator

```java
//Array concreate iterator
public class ArrayIterator implements Iterator {
MenuItem[] items;
int position = 0;
public ArrayIterator(MenuItem[] items) {
this.items = items;
}
public MenuItem next() {
MenuItem menuItem = items[position];
position = position + 1;
return menuItem;
}
public boolean hasNext() {
if (position >= items.length || items[position] == null) {
return false;
}
else {
return true;
}
         }
    }
```
