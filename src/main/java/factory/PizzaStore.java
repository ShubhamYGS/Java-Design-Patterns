package factory;

/*Factory class:
 * Hides the object creation. The factory pattern is also known as virtual constructor.
 * 1. Create a interface with required method (Pizza).
 * 2. Create subclasses that implements pizza interface. (VegPizza, CheesePizza, MeatPizza)
 * 3. Create a factory class which decides which pizza you want and on the basis of that it will create the
 * object of that pizza. (Create a nested class with createPizza and return Pizza as object)
 * 4. Call PizzaFactory with createPizza nested class by mentioning the type of pizza you want.
 */

public class PizzaStore {
    public static void main(String[] args) {
        Pizza p = new PizzaFactory().createPizza("Veg");
        p.prepare();
        p.bake();
        p.cut();
    }
}
