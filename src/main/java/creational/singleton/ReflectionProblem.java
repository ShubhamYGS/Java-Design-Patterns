package creational.singleton;

/*To break singleton Steps we follow
* 1. Get all the constructor out of the class
* 2. Iterate over all the constructor and make it accessible
* 3. Create a new object and assign it
*
* To Stop it:
* Either you check in private constructor if instance != null then throw new exception
* else by creating enum with only one constant field INSTANCE (As ENUM don't have constructors)*/

import java.lang.reflect.Constructor;

public class ReflectionProblem {
    STLazyInstantiation st1 = STLazyInstantiation.getInstance();
    STLazyInstantiation st2 = null;

    Constructor[] constructors = STLazyInstantiation.class.getDeclaredConstructors();
//    for(Constructor constructor : constructors) {
//        constructor.setAccessible(true);
//        try {
//            st2 = (STLazyInstantiation) constructor.newInstance();
//        } catch (InstantiationException | IllegalAccessException | RuntimeException | InvocationTargetException e) {
//            e.printStackTrace();
//        }
//    }
}
