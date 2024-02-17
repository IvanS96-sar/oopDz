package oop;

public final class Car extends MotorTransport {
    private String modelCar;
    private  String brandCar;

    public Car(int numberOfWheels, int maximumSpeed, String engineType, String modelCar, String brandCar) {
        super(numberOfWheels, maximumSpeed, engineType);
        this.modelCar = modelCar;
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }
    @Override
    public void service(){
        super.service();
        System.out.println("Обсужен автомобиль " + modelCar + " " + brandCar + ".");
    }
    public final void travel(){
        System.out.println("Отправляемся в путешествие");
    }
}
