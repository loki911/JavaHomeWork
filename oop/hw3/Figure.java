package oop.hw3;

public class Figure  implements Equal {

    public boolean isTriangle(){
        return false;
    }

    public boolean isRectangle(){
        return false;
    }

    public abstract double getArea();

    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean equalSquares(Figure inputShape) {
        return this.getArea() == inputShape.getArea();
    }
}
