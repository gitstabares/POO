package T3.domain;

public class Square extends Shape {
    private float height;
    public Square(int id, float x, float y, float sideLength) {
        super(id, x, y);
        this.height = sideLength;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getWidth() {
        return height;
    }
    public void setWidth(float width) {
        this.height = width;
    }
    @Override
    public float getArea() {
        return getHeight() * getWidth();
    }
    @Override
    public float getPerimeter() {
        return 2 * (getHeight() + getWidth());
    }
}