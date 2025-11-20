package T3.view;

import T3.domain.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShapeList list = new ShapeList();
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Create a new shape.\n" + //
                                "2. Display all shapes in the list, along with their id, reference point, dimensions, area, and perimeter.\n" + //
                                "3. Display information about a specific shape by its id.\n" + //
                                "4. Display the total area and total perimeter of all shapes.\n" + //
                                "5. Exit.");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Select shape type:\n1. Circle\n2. Rectangle\n3. Triangle\n4. Square\n5. Oval");
                    int shapeType = sc.nextInt();
                    System.out.print("Enter reference point (x,y): ");
                    float x = sc.nextFloat();
                    float y = sc.nextFloat();
                    Shape shape = null;
                    switch (shapeType) {
                        case 1:
                            System.out.print("Enter radius: ");
                            float radius = sc.nextFloat();
                            shape = new Circle(x, y, radius);
                            break;
                        case 2:
                            System.out.print("Enter width and height: ");
                            float width = sc.nextFloat();
                            float height = sc.nextFloat();
                            shape = new Rectangle(x, y, width, height);
                            break;
                        case 3:
                            System.out.print("Enter sides (side1 side2 side3): ");
                            float side1 = sc.nextFloat();
                            float side2 = sc.nextFloat();
                            float side3 = sc.nextFloat();
                            shape = new Triangle(x, y, side1, side2, side3);
                            break;
                        case 4:
                            System.out.print("Enter side length: ");
                            float side = sc.nextFloat();
                            shape = new Square(x, y, side);
                            break;
                        case 5:
                            System.out.print("Enter major and minor radius: ");
                            float majorRadius = sc.nextFloat();
                            float minorRadius = sc.nextFloat();
                            shape = new Oval(x, y, majorRadius, minorRadius);
                            break;
                        default:
                            System.out.println("Invalid shape type.");
                    }
                    if (shape != null) {
                        list.addShape(shape);
                        System.out.println("Shape created with ID: " + shape.getID());
                    }
                    break;
                case 3:
                    System.out.print("Enter shape ID: ");
                    int id = sc.nextInt();
                    shape = list.getShape(id);
                    if (shape != null) {
                        System.out.println("Shape Area: " + shape.getArea() + "\nPerimeter: " + shape.getPerimeter() + "\nPosition: (" + shape.getX() + ", " + shape.getY() + ")");
                        if (shape instanceof Circle) {
                            Circle c = (Circle) shape;
                            System.out.println("Circle:\nRadius: " + c.getMinorRadius());
                        } else if (shape instanceof Rectangle) {
                            Rectangle r = (Rectangle) shape;
                            System.out.println("Rectangle:\nWidth: " + r.getWidth() + "\nHeight: " + r.getHeight());
                        } else if (shape instanceof Triangle) {
                            Triangle t = (Triangle) shape;
                            float[] sides = t.getSides();
                            System.out.println("Triangle:\nSides: " + sides[0] + ", " + sides[1] + ", " + sides[2]);
                        } else if (shape instanceof Square) {
                            Square s = (Square) shape;
                            System.out.println("Square:\nSide: " + s.getHeight());
                        } else if (shape instanceof Oval) {
                            Oval o = (Oval) shape;
                            System.out.println("Oval\nMajor Radius: " + o.getMajorRadius() + "\nMinor Radius: " + o.getMinorRadius());
                        }
                    } else {
                        System.out.println("Shape with ID " + id + " not found.");
                    }
                    break;
                case 4:
                    System.out.println("Total Area: " + list.getTotalArea());
                    System.out.println("Total Perimeter: " + list.getTotalPerimeter());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 5);
        sc.close();
    }
}
