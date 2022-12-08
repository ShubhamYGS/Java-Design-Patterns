package creational.prototype;

public class Square extends Shape{

    public Square(int width, int height) {
        super(width, height);
    }

    @Override
    void draw() {
        System.out.println("Square with width: "+width+" height: "+height);
    }

    @Override
    public Shape clone() {
        return new Square(width, height);
    }
}
