package T3.domain;

public class Square extends Shape {
    private float height;

    public Square(int id, float x, float y, float sideLength) {
        setID(id);
        setX(x);
        setY(y);
        this.sideLength = sideLength;
    }
    
}