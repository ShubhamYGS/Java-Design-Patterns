package structural.facade;

/*Facade Design Pattern: Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system.
* This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.
* Eg., In order processing we have to dealt with multiple processes like checking stock, placing order and shipping that order. So instead of dealing with separately. We can have a single facade class which can deal with them.
* 1. Create OrderProcessor class which has all the method like checkStock(), placeOrder() and shipOrder(). We can also have these methods as a class separately.
* 2. Create a facade class which combines everything into it. Like first checking the stock. If it is available then placing order. Taking it's order id and shipping it.
* 3. In main method we can simply call that facdeOrderProcessor class with productName and quantity.
 */

public class MainFacade {
    public static void main(String[] args) {
        FacadeOrderProcess orderProcess = new FacadeOrderProcess();
        orderProcess.processOrder("Macbook", 2);
    }
}
