package decorator;

public class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void bake() {
        pizza.bake();
    }
}
