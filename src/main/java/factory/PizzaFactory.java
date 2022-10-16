package factory;

public class PizzaFactory {

    public Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("Veg"))
            return new VegPizza();
        else if (type.equalsIgnoreCase("Meat"))
            return new MeatPizza();
        else if (type.equalsIgnoreCase("Cheese"))
            return new CheesePizza();

        return null;
    }
}
