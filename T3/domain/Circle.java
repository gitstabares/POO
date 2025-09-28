package T3.domain;

public class Circle extends Shape{
    private float minorRadius;
    Circle(int id, float x, float y, float radius)
    {
        super(id, x, y);
        this.minorRadius = radius;
    }
    public void setMinorRadius(float minorRadius) {
        this.minorRadius = minorRadius;
    }
    public float getMinorRadius() {
        return minorRadius;
    }
    public void setMajorRadius(float majorRadius) {
        this.minorRadius = majorRadius;
    }
    public float getMajorRadius() {
        return minorRadius;
    }
    public float getArea() {
        return (float) (Math.PI * getMajorRadius() * getMinorRadius());
    }
    public float getPerimeter() {
        return (float) (2 * Math.PI * getMinorRadius());
    }
}
