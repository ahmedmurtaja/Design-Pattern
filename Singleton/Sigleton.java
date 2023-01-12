package Singleton;

public class Sigleton {
    private static Sigleton instancSigleton; // 1. static instance 

    private Sigleton() { // 2. private constructor to prevent creating new instance
        
    }
    public static Sigleton getInstance() // 3. static method to get the instance
    {
        if(instancSigleton == null)  // 4. check if the instance is null
        {
            instancSigleton = new Sigleton();
        }
        return instancSigleton;  // 5. return the instance
    }
    
}
