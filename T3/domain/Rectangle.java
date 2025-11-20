package T3.domain;

public class Rectangle extends Square {
    private float width;
    public Rectangle(float x, float y, float height, float width) {
        super(x, y, height);
        this.width = width;
    }
    @Override
    public float getWidth() {
        return width;
    }
    @Override
    public void setWidth(float width) {
        this.width = width;
    }
}
