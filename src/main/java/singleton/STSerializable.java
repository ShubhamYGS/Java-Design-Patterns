package singleton;

import java.io.Serializable;

/*
* To serialize any class implements the Serializable Interface
* Problem: When we serialize the only object of singleton class and then if we deserialize it later.
* the objects will not be same. (this is not the appropriate behaviour of singleton class).
* To solve: implement existed readResolve() method to solve this issue by returning the same object
* [Make it private or protected so that no other class can able to access it]
 */
public class STSerializable implements Serializable, Cloneable {

    private static final long serialVersionUID = 1l;
    public static STSerializable instance;

    private STSerializable() {

    }

    public static STSerializable getInstance() {
        if(instance == null)
            instance = new STSerializable();
        return instance;
    }

    // This method will solve the problem with deserialization as it returns the same object
    private Object readResolve() {
        return instance;
    }

    //Suppose if someone tries to clone the object. Then block them by no throwing CloneNotSupportedException exception.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
