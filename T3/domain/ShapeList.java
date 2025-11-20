package T3.domain;

import java.util.List;
import java.util.ArrayList;

public class ShapeList {
    private List<Shape> shapes;
    public ShapeList() {
        this.shapes = new ArrayList<Shape>();
    }
    public void addShape(Shape shape) {
        if (!shapes.contains(shape)) this.shapes.add(shape);
    }
    public List<Shape> getList() {
        return this.shapes;
    }
    public Shape getShape(int id) {
        for (Shape s: this.shapes) {
            if (s.getID() == id) {
                return s;
            }
        }
        return null;
    }
    public float getTotalArea() {
        float totalArea = 0;
        for (Shape s: this.shapes) {
            totalArea += s.getArea();
        }
        return totalArea;
    }
    public float getTotalPerimeter() {
        float totalPerimeter = 0;
        for (Shape s: this.shapes) {
            totalPerimeter += s.getPerimeter();
        }
        return totalPerimeter;
    }
}
