/**Создать класс Point, описывающий точку в двумерных координатах. Полями этого класса должны быть координаты x и y.
 * Класс должен иметь один конструктор, принимающий координаты x и y. Сделайте информацию о координатах скрытой,
 * а получить её можно только с помощью методов доступа (getById/set). Создать метод distance, принимающий объект Point
 * и определяющий расстояние до неё.
 */
package oop;

public final class Point {
        private double x;
        private double y;

        public Point (double x, double y){
            this.x = x;
            this.y = y;
        }
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
        public double distance (Point point) {
            return Math.sqrt(Math.pow((point.x - this.x),2) + Math.pow((point.y - this.y),2));
        }
        public Point translate(double x, double y) {
            return new Point(this.x + x, this.y + y);
    }

        public Point scale(double z) {
            return new Point(this.x * z, this.y * z);
    }
        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
    }
}
