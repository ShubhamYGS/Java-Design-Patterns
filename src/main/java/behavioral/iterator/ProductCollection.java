package behavioral.iterator;

public class ProductCollection implements Collection{

    int numOfProducts = 0;
    Product[] products;

    ProductCollection() {
        products = new Product[10];
    }

    public void addProduct(Product product) {
        products[numOfProducts++] = product;
    }

    @Override
    public Iterator createIterator() {
        return new ProductIterator(products);
    }
}
