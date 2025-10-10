package T3.domain;

public class Triangle extends Shape {
    private float[] sides;
    public Triangle(float x, float y, float side1, float side2, float side3) {
        super(x, y);
        sides = new float[]{side1, side2, side3};
    }
    public void setSides(float side1, float side2, float side3) {
        sides[0] = side1;
        sides[1] = side2;
        sides[2] = side3;
    }
    public float[] getSides() {
        return sides;
    }
    @Override
    public float getArea() {
        return (float) (Math.sqrt(4*Math.pow(sides[0],2)*Math.pow(sides[1],2)-Math.pow(Math.pow(sides[2],2)-Math.pow(sides[0],2)-Math.pow(sides[1],2),2))/4);
    }
    @Override
    public float getPerimeter() {
        return sides[0] + sides[1] + sides[2];
    }
}
