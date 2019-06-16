package collections;

public class TestGarage {
    public static void main(String[] args) {
        Garage garage = new Garage();

        PassengerCar nissan = new PassengerCar("Nissan", "Primera", 2001, "hatchback", "silver", 160);
        PassengerCar toyota= new PassengerCar("Toyota", "Camry", 2013, "sedan", "black", 180);
        Truck volvo = new Truck("Volvo", "FH", 2002, "truck", "white", 120);
        Motorcycle harley = new Motorcycle("Harley", "Roadster", 2012, "moto", "black", 150);
        garage.parkingCar(nissan);
        garage.parkingCar(toyota);
        garage.parkingCar(volvo);
        garage.parkingCar(harley);

        System.out.println("Автомобили в гараже:");
        garage.garageDescription();

        System.out.println("Количество автомобилей Toyota в гараже: " + garage.numberOfCars(toyota) + "\n");

        System.out.println("Автомобиль Volvo выехал из гаража.");
        garage.getCar(volvo);
        System.out.println();

        System.out.println("Автомобили в гараже:");
        garage.garageDescription();
    }
}
