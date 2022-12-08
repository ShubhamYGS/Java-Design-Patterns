package structural.decorator;

public class CheesePizzaDecorator extends PizzaDecorator {
    CheesePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        addCheeseToppings(pizza);
    }

    public void addCheeseToppings(Pizza pizza) {
        System.out.println("Adding Cheese Toppings");
    }
}
