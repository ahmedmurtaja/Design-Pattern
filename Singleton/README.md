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

- ~~public~~ private constructor to prevent other objects from instantiating this class.
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

### Dealing with Multithreading

- Double-checked locking
- Synchronized method
- Synchronized block
- Bill Pugh Solution

### Synchronized method

By adding the synchronized keyword to
getInstance(), we force every thread to
wait its turn before it can enter the
method. That is, no two threads may
enter the method at the same time.

```java
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

### Can we improve multithreading?

1. Do nothing if the performance of getInstance() isn’t critical to your application
   > The performance of the synchronized method is not good enough for high-performance applications.
   > The synchronized keyword is expensive because it causes the thread to block until the method is finished.
   > if calling the getInstance() method isn’t causing substantial overhead for your application, forget about it. Synchronizing getInstance() is straightforward and effective. Just keep in mind that synchronizing a method can decrease performance by a factor of 100, so if a high traffic part of your code begins using getInstance(), you may have to reconsider.
2. Move to an eagerly created instance rather than a lazily created one

```java
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
```

3. Double-checked locking

Use “double-checked locking” to reduce the use of synchronization in getInstance()

> With double-checked locking, we first check to see if an instance is created, and if not, THEN we synchronize. This way, we only synchronize the first time through, just what we want.

```java

public class Singleton {

private volatile static Singleton uniqueInstance;
// volatile is used to prevent the compiler from caching the value of uniqueInstance in the register of the CPU and to force it to read the value from main memory. This is important because the value of uniqueInstance may change in another thread.

 
private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) { // check if the instance is created or not
            synchronized (Singleton.class) { // synchronized block if not created(only one thread can access this block
                                             // at a time) in the first time
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
```
