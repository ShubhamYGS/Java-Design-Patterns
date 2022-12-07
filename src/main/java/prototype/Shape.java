package prototype;

public abstract class Shape implements Cloneable{
    protected int width;
    protected int height;
    abstract void draw();

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public abstract Shape clone();
}
