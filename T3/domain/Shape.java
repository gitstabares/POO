package T3.domain;

public abstract class Shape {
    private int id;
    private float x,y;
    public abstract float area();
    public abstract float getPerimeter();
    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
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