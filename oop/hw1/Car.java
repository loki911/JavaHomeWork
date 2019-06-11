package oop;
/**Реализуйте класс Саг, моделирующий передвижение автомобиля на бензиновом топливе по оси х.
 * Предоставьте методы для передвижения автомобиля на заданное количество километров, заполнения топливного бака
 * заданным количеством литров бензина, вычисления расстояния, пройденного от начала координат,
 * а также уровня топлива в баке. Укажите расход топлива (в л/км) в качестве параметра конструктора данного класса.*/

public class Car {

    private double distance;
    private double level;
    private double consumption;

    public Car(double consumption) {
        this.consumption = consumption;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public void move(double length) {
        setDistance(getDistance() = length);
        setLevel(getLevel() - length * getConsumption());
    }
    public void refueling (double litres) {
        setLevel(getLevel() + litres);
    }
    
    public void move(double km) {
        setDistance(getDistance() + km);
        setLevel(getLevel() - km * getConsumption());
    }
    
    public void refueling(double litres) {
        setLevel(getLevel() + litres);
    }
}
