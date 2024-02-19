package oop;

public final class Truck extends MotorTransport{
    private int truckLoadCapacity;

    public Truck(int numberOfWheels, int maximumSpeed, String engineType, int truckLoadCapacity) {
        super(numberOfWheels, maximumSpeed, engineType);
        this.truckLoadCapacity = truckLoadCapacity;
    }

    public int getTruckLoadCapacity() {
        return truckLoadCapacity;
    }

    public void setTruckLoadCapacity(int truckLoadCapacity) {
        this.truckLoadCapacity = truckLoadCapacity;
    }
    @Override
    public void service(){
        super.service();
        System.out.println("Обслужен грузовик с максимальной грузоподъемностью " + truckLoadCapacity + " тонн.");
    }
    public final void departure(){
        System.out.println("Все обслужено,пора отправляться в рейс");
    }
}
