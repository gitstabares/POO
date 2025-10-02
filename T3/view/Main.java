package T3.view;

import T3.domain.*;

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(1, 0, 0, 3, 4, 5);
        System.out.println("Triangle Area: " + t.getArea());
        Square s = new Square(2,0,0,4);
        System.out.println("Square Area: " + s.getArea());
        Rectangle r = new Rectangle(3,0,0,4,5);
        System.out.println("Rectangle Area: " + r.getArea());
    }
}
