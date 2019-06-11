package oop;

public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point(3, 4).translate(1, 3).scale(2);
        System.out.println(point1.toString());
        Point point2 = new Point(3, 4).translate(1, 3);
        System.out.println(point2.getX() + ", " + point2.getY());
        Point point3 = new Point(4, 7).scale(2);
        System.out.println(point3.toString());
    }
}
