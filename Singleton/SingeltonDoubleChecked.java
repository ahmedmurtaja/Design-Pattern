package Singleton;

public class SingeltonDoubleChecked {
    private static volatile SingeltonDoubleChecked instance; // 1. static instance

    private SingeltonDoubleChecked() { // 2. private constructor to prevent creating new instance

    }

    public static SingeltonDoubleChecked getInstance() // 3. static method to get the instance
    {
        if (instance == null) // 4. check if the instance is null
        {
            synchronized(SingeltonDoubleChecked.class) {
                if (instance == null) {
                    instance = new SingeltonDoubleChecked();
                }
            }
        }
        return instance; // 5. return the instance
    }
    
}
