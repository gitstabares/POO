package T3.domain;

public class Circle extends Shape{
    private float minorRadius;
    public Circle(float x, float y, float radius)
    {
        super(x, y);
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
        return (float) (Math.PI * (3 * (getMajorRadius() + getMinorRadius()) - Math.sqrt((3 * getMajorRadius() + getMinorRadius()) * (getMajorRadius() + 3 * getMinorRadius()))));
    }
}
