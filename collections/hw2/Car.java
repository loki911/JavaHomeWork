package collections;

import java.util.Objects;

/**
 *        Создать абстрактный класс Car, представляющий собой автомобиль. Добавить в него поля:
 *        марка, модель, год выпуска + несколько своих. Создать 4 класса, являющихся наследниками Car.
 *        Переопределить во всех 3-х классах методы equals(), hashCode() и toString() Создать класс Garage,
 *        хранящий в себе HashMap автомобилей, в котором ключом является объект автомобиля,
 *        значением - количество точно таких автомобилей в гараже. Добавить в класс Garage методы для парковки,
 *        выезда авто, а также для получения количества определенного вида автомобилей. Продемонстрировать работу гаража. *
 */

        public abstract class Car {
        private final String brand;
        private final String model;
        private final Integer year;
        private final String type;
        private final String color;
        private final Integer speed;

        public Car(String brand, String model, Integer year, String type, String color;Integer speed) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.type = type;
            this.color = color;
            this.speed = speed;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public Integer getYear() {
            return year;
        }

        public String getType() {
            return type;
        }

        public String getColor() {
            return color;
        }

        public Integer getSpeed() {
            return speed;
        }

        @Override
        public String toString() {
            return "Марка = " + brand +
                    ",\n Модель = " + model +
                    ",\n Год выпуска = " + year +
                    ",\n Тип кузова= " + type +
                    ",\n Цвет = " + color +
                    ",\n Максимальная скорость = " + speed;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Car car = (Car) o;
            return brand.equals(car.brand) &&
                    model.equals(car.model) &&
                    year.equals(car.year) &&
                    type.equals(car.type) &&
                    color.equals(car.color) &&
                    speed.equals(car.speed);
        }

        @Override
        public int hashCode() {
            return Objects.hash(brand, model, year, type, color, speed);
        }
    }
}
