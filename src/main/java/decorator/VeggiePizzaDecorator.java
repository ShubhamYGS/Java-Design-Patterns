package decorator;

public class VeggiePizzaDecorator extends PizzaDecorator {

    VeggiePizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void bake() {
        super.bake();
        addVegToppings(pizza);
    }

    public void addVegToppings(Pizza pizza) {
        System.out.println("Adding Veggie Toppings");
    }
}
