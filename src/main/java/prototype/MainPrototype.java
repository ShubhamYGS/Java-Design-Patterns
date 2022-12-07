package prototype;

/* Prototype Design Pattern: Everytime creating an object when requested. The concept is to copy an existing object rather than creating a new instance from scratch, something that may include costly operations.
* Prototype allows us to hide the complexity of making new instances from the client.
* . Prototype patterns are required, when object creation is time consuming, and costly operation, so we create objects with the existing object itself.
* Use clone() method to create an object instead of new() keyword.
*
* 1. Create abstract Shape class with width, height and draw() method. Create a constructor to initialize width and height. Create an abstract shape clone() method which returns cloneable object.
* 2. Create Rectangle class which extends Shape class. Write a constructor which class parent constructor. Override a clone() method and return the new object of that class. [Do same with Square]
* 3. In main method Create an object of rectangle and pass width and height and call draw() method. Again create another object with the help of clone() method.
* 4. Both object will return the same data.
 */

public class MainPrototype {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        rectangle.draw();

        Shape cloneRectangle = rectangle.clone();
        cloneRectangle.draw();
    }
}
