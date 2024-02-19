package oop;

import java.util.Scanner;

public class CarService {
    public static void main(String[] args) {
//        Bicycle bicycle = new Bicycle(2,32,"горный");
//        Car car = new Car(4,224,"бензиновый","Ford","focus");
//        Truck truck = new Truck(10,130,"дизельный",17000);
//        visitServiceStation(bicycle);
//        visitServiceStation(car);
//        visitServiceStation(truck);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите навзание");
        String type = scanner.nextLine();

        WheeledTransport wheeledTransport = null ;

        if(type.equalsIgnoreCase("авто") ){
            wheeledTransport = new Car(4,224,"бензиновый","Ford","focus");
        } else if (type.equalsIgnoreCase("грузовик")  ) {
            wheeledTransport = new Truck(10,130,"дизельный",17000);
        } else if (type.equalsIgnoreCase("велосипед")) {
            wheeledTransport = new Bicycle(2,32,"горный");
        } else {
            System.out.println("Такого транспорта нет");
            return;
        }
        visitServiceStation(wheeledTransport);
    }
    public static void visitServiceStation(WheeledTransport wheeledTransport){
        wheeledTransport.service();
        if (wheeledTransport instanceof Car){
            Car ford = (Car) wheeledTransport;
            ford.travel();
        } else if (wheeledTransport instanceof Truck) {
            Truck truck = (Truck)wheeledTransport;
            truck.departure();
        } else if (wheeledTransport instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) wheeledTransport;
            bicycle.ride();
        }
    }
}
