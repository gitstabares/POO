package T3.domain;

public abstract class Shape {
    static private int avalaibleID = 1;
    private int id;
    private float x,y;
    protected Shape(float x, float y)
    {
        this.id = avalaibleID++;
        this.x = x;
        this.y = y;
    }
    public abstract float getArea();
    public abstract float getPerimeter();
    public int getID() {
        return id;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
}