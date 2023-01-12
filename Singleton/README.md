## Singelton Pattern

### Definition

The singleton pattern is a software design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system.

- ensure that there is no more single instance
- provide a global point of access to it

### Class Diagram

<div align="center">
    <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Singleton_UML_class_diagram.svg/1200px-Singleton_UML_class_diagram.svg.png" width="400" />
</div>

### How To Implement ?

-  ~~public~~ private constructor to prevent other objects from instantiating this class.
- private static variable of the same class that is the only instance of this class.
- public static method that returns the instance of the class, this is the global access point for outer world to get the instance of the singleton class.
- lazy initialization

### Example

```java
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

### Pros

- memory optimization
