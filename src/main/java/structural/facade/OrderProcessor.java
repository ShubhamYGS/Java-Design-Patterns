package structural.facade;

public class OrderProcessor {

    public boolean checkStock(String productName) {
        System.out.println("Checking stock of "+productName);
        return true;
    }

    public int placeOrder(String productName, int quantity) {
        System.out.println("Order Placed ...");
        return 4346;
    }

    public void shipOrder(int orderId) {
        System.out.println("Order shipped with Order ID: "+ orderId);
    }
}
