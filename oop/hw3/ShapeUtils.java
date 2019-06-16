package oop.hw3;

public final class ShapeUtils {

    private ShapeUtils() {
    }

    public static boolean isRectangle(Figure inputShape) {
        return inputShape instanceof Rectangle;
    }

    public static boolean isTriangle(Figure inputShape) {

        return inputShape instanceof Triangle;
    }
}
