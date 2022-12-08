package creational.singleton;

import java.io.*;

/*Singleton class:
* a class must ensure that only single instance should be created and single object can be used by all other classes.
 */

public class STMainMethod {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        STLazyInstantiation st = STLazyInstantiation.getInstance();
        STLazyInstantiation st1 = STLazyInstantiation.getInstance();

        System.out.println(st == st1);

        /*Serializing and deserializing the object*/
        //Creating Object
        STSerializable stl = STSerializable.getInstance();
        STSerializable stl1 = null;

        FileOutputStream fs = new FileOutputStream("objectfile.ser");
        ObjectOutputStream os = new ObjectOutputStream(fs);
        os.writeObject(stl);

        FileInputStream fs1 = new FileInputStream("objectfile.ser");
        ObjectInputStream os1 = new ObjectInputStream(fs1);
        stl1 = (STSerializable) os1.readObject();

        System.out.println(stl == stl1);
    }
}
