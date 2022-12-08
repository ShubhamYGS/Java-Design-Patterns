package behavioral.iterator;

public class ProductIterator implements Iterator{

    Product[] products;
    int position = 0;

    ProductIterator(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        if(position >= products.length || products[position] == null)
            return false;
        return true;
    }

    @Override
    public Object next() {
        return products[position++];
    }
}
