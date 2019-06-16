package oop.hw3;

public class Circle extends Figure implements Perimetr {
    private Point centerPoint;
    private int radius;

    public Circle(Point centerPoint, int radius) {
        super();
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle {" +
                "centerPoint=" + centerPoint +
                ", radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public int getRadius() {
        return radius;
    }
}
