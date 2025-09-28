package T3.view;

import T3.domain.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle(1, 0, 0, 3, 4, 5);
        System.out.println("Area: " + t.getArea());
    }
}
