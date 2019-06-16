package oop.hw3;

public class Test {

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(new Point(1,1), new Point(3,3), new Point(5, 1));
        Rectangle rectangle = new Rectangle(new Point(1,2), new Point(1,4), new Point(3,6), new Point(3,1));
        Triangle triangle2 = new Triangle(new Point(1,2), new Point(1,4), new Point(1, 6));
        Point point1 = new Point(0,0);
        Circle firstCircle = new Circle(point1, 2);
        Square square1 = new Square(new Point(1,2), new Point(1,3), new Point(2,3), new Point(2,2));

        System.out.println(square1.isRectangle());
        System.out.println(point1.isRectangle());
        System.out.println(triangle1.isRectangle());
        System.out.println(square1.isTriangle());
        System.out.println(point1.isTriangle());
        System.out.println(triangle2.isTriangle());
        System.out.println();

        System.out.println(ShapeUtils.isTriangle(triangle1));
        System.out.println(ShapeUtils.isTriangle(rectangle));
        System.out.println(ShapeUtils.isRectangle(triangle1));
        System.out.println(ShapeUtils.isRectangle(rectangle));
        System.out.println();

        System.out.println(triangle1.equalSquares(rectangle));
        System.out.println(triangle1.equalSquares(triangle2));
        System.out.println(rectangle.equalSquares(point1));
        System.out.println(point1.equalSquares(new Point(1,1)));
        System.out.println();

        System.out.println("Периметр треугольника: " + triangle1.getPerimetr());
        System.out.println("Площадь треугольника: " + triangle1.getArea());
        System.out.println(triangle1.getName());
        System.out.println(triangle1.toString());
        System.out.println();

        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimetr());
        System.out.println("Ширина/высота прямоугольника: " + rectangle.getWidth() + " / " + rectangle.getHeight());
        System.out.println("Длина диагонали прямоугольника: " + rectangle.firstDiagonalLength());
        System.out.println(rectangle.getName());
        System.out.println(rectangle.toString());
        System.out.println();

        System.out.println("Площадь круга: " + firstCircle.getArea());
        System.out.println("Длина окружности"  + firstCircle.getPerimetr());
        System.out.println("Радиус окружности: " + firstCircle.getRadius());
        System.out.println(firstCircle.getName());
        System.out.println(firstCircle.toString());
        System.out.println();

        System.out.println("Площадь квадрата: " + square1.getArea());
        System.out.println("Периметр квадрата: " + square1.getPerimetr());
        System.out.println("Длина стороны квадрата: " + square1.getHeight());
        System.out.println("Длина диагоналей квадрата: " + square1.firstDiagonalLength());
        System.out.println(square1.getName());
        System.out.println(square1.toString());

    }
}
