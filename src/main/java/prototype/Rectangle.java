package prototype;

public class Rectangle extends Shape{

    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    void draw() {
        System.out.println("Square with width: "+width+" height: "+height);
    }

    @Override
    public Shape clone() {
        return new Rectangle(width, height);
    }
}
