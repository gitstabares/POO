package T3.domain;

public class Oval extends Circle {
    private float majorRadius;
    Oval(int id, float x, float y, float minorRadius, float majorRadius) {
        super(id, x, y, minorRadius);
        this.majorRadius = majorRadius;
    }
    @Override
    public float getMajorRadius() {
        return majorRadius;
    }
    @Override
    public void setMajorRadius(float majorRadius) {
        this.majorRadius = majorRadius;
    }
    @Override
    public float getPerimeter() {
        return (float) (Math.PI * (3 * (getMajorRadius() + getMinorRadius()) - Math.sqrt((3 * getMajorRadius() + getMinorRadius()) * (getMajorRadius() + 3 * getMinorRadius()))));
    }
}
