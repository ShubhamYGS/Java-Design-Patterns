package decorator;

/*Decorator Pattern: Decorator design pattern allows us to dynamically add functionality and behavior to an object without affecting the behavior of other existing objects within the same class.
* We use inheritance to extend the behavior of the class.
* Decorator design patterns create decorator classes, which wrap the original class and supply additional functionality by keeping the class methods’ signature unchanged.
* eg., FileReader, BufferReader etc.
* Steps to create decorator class:
* 1) Create a Pizza interface with bake as void method
* 2) implement this Pizza interface and create PlainPizza class
* 3) Create a decorator class which also implements pizza class. Inside decorator class create protected variable of Pizza interface and initialize it in constructor of decorator class. Override bake method and call bake method with protected Pizza  variable.
* 4) Create CheesePizzaDecorator and VeggiePizzaDecorator which extends PizzaDecorator class and call super constructor and bake method by overriding it. Add extra veggie to the plainPizza by adding a required (extraVeggie) method inside overriden bake method. Same with CheesePizza.
* 5) Inside main method. Create an object of pizza and create new CheesePizzaDecorator(new PlainPizza());.
* */

public class DecoratorMain {

    public static void main(String[] args) {
        System.out.println("Calling Normal Pizza: ");
        Pizza pizza = new PlainPizza();
        pizza.bake();

        System.out.println("\nCalling Cheese and PlainPizza: ");
        Pizza pizza1 = new CheesePizzaDecorator(new PlainPizza());
        pizza1.bake();

        System.out.println("\nCalling Veg, Cheese and normal Pizza: ");
        Pizza pizza2 = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
        pizza2.bake();

    }
}
