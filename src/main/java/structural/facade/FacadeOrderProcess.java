package structural.facade;

public class FacadeOrderProcess {

    private OrderProcessor order = new OrderProcessor();
    public void processOrder(String productName, int quantity) {

        if(order.checkStock(productName)) {
            int orderId = order.placeOrder(productName, quantity);
            order.shipOrder(orderId);
        }
    }

}
