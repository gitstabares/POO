package T3.domain;

public class Oval extends Circle {
    private float majorRadius;
    public Oval(int id, float x, float y, float minorRadius, float majorRadius) {
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
}
