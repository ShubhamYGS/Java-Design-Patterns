package singleton;

/* Use eager instantiation hen you are sure that this object will be used at least one time*/

public class STEagerInstantiation {
    private static STEagerInstantiation instance = new STEagerInstantiation();
    private STEagerInstantiation() {
    }
    public static STEagerInstantiation getInstance() {
        return instance;
    }
}
