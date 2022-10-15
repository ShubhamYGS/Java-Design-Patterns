package singleton;

/* Making it thread safe by creating a synchronized block
* Context switching is heavy operation in Multithreaded environment that's why first check if instance is null
* then only create the instance. Volatile keyword to make it thread-safe.*/

public class STThreadSafe {
    public static volatile STThreadSafe instance;
    private STThreadSafe() {
    }
    public static STThreadSafe getInstance() {
        if(instance == null)
            synchronized (STThreadSafe.class) {
                if(instance == null)
                    instance = new STThreadSafe();
            }

        return instance;
    }
}
