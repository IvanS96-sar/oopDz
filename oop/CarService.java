package oop;

public class CarService {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(2,32,"горный");
        Car car = new Car(4,224,"бензиновый","Ford","focus");
        Truck truck = new Truck(10,130,"дизельный",17000);
        visitServiceStation(car,bicycle,truck);
    }
    public static void visitServiceStation(Car car,Bicycle bicycle,Truck truck){
        car.service();
        System.out.println();
        bicycle.service();
        System.out.println();
        truck.service();
    }
}
