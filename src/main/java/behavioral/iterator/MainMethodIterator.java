package behavioral.iterator;

/* Iterator Pattern: It is the most widely used design pattern. It is used to iterate over the objects.
* The iterator pattern provides a way to access the elements of an aggregate object without exposing its underlying representation.
* Steps to create Iterator Pattern:
* 1. Create a Product Pojo class which contains a string name with constructor and getter, setter.
* 2. Create an empty Collection interface. Extend this interface and create ProductCollection class which contains Products[] array and numOfProducts variable which tracks number of products added.
* 3. Inside ProductCollection class. Create a constructor and initialize products array with default value 10. Create addProduct method which accept product and add it into the products array and increment the numOfProducts.
* 4. Create an iterator interface with hasNext() and next() method. Create ProductIterator class which implements Iterator interface. Override hasNext() method and write the logic where the length of currentPosition is greater than total array return false or if no product present.
* 5. Inside same class implement next method which returns Product object and increment the currentPosition counter.
* 6. Add createIterator() method inside collection interface. Which passes the current products array to iterator class. Whenever the creatIterator() method is called automatically the product of array is stored in iterator.
* 7. Implement createIterator inside ProductCollection class and give the products array with new ProductIterator(productArray). Inside ProductIterator class accept the same in a constructor and initialize it to local products array.
* 8. In main method Create ProductCollection and add products using addProduct() method. Get the iterator with createIterator() method.
 */

public class MainMethodIterator {

    public static void main(String[] args) {
        ProductCollection products = new ProductCollection();
        products.addProduct(new Product("MacBook"));
        products.addProduct(new Product("Samsung"));
        products.addProduct(new Product("Pixel"));

        Iterator iterator = products.createIterator();
        while (iterator.hasNext()) {
            Product object = (Product) iterator.next();
            System.out.println(object.getName());
        }
    }
}
