package creational.singleton;

/*Steps to make Singleton class (Lazy Instantiation)
1. Make constructor private
2. create a static instance
3. create static method to give the global access to only one instance of this class
(Check if instance is null if it's not create a new object and assign it to instance. So when next time
someone triggers it. It gives the already generated object.)
* */
public class STLazyInstantiation {

    private static STLazyInstantiation instance;
    private STLazyInstantiation() {
    }
    public static STLazyInstantiation getInstance() {
        if(instance == null)
            instance = new STLazyInstantiation();
        return instance;
    }
}
