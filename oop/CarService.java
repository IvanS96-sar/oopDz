package oop;

public class CarService {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(2, 32, "горный");
        Car car = new Car.Builder()
                .numberOfWheels(4)
                .maximumSpeed(240)
                .engineType("бензиновый")
                .modelCar("ford")
                .brandCar("focus")
                .build();
        Truck truck = new Truck(10, 130, "дизельный", 17000);
        Bicycle bicycle1 = new Bicycle(3, 25, "дорожный");
        Car car1 = new Car.Builder()
                .numberOfWheels(4)
                .maximumSpeed(320)
                .engineType("дизельный")
                .modelCar("Audi")
                .brandCar("A6")
                .build();
        Truck truck1 = new Truck(8, 125, "дизельный", 16500);
        ServiceStation serviceStation = new ServiceStation();

        WheeledTransport[] transports = {bicycle, bicycle1, car, car1, truck, truck1};
        for (WheeledTransport transport : transports) {
            serviceStation.visitServiceStation(transport);
        }
    }
}
