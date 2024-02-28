package oop;

public final class Car extends MotorTransport {
    private String modelCar;
    private  String brandCar;

    public Car(Builder builder) {
        super(builder.numberOfWheels, builder.maximumSpeed, builder.engineType);
        this.modelCar = builder.modelCar;
        this.brandCar = builder.brandCar;
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
        serviceCar();
        travel();
    }
    public final void travel(){
        System.out.println("Отправляемся в путешествие");
    }
    public void serviceCar(){
        System.out.println("Обсужен автомобиль " + modelCar + " " + brandCar + ".");
    }
    public static class Builder {
        private String modelCar;
        private  String brandCar;
        private int numberOfWheels;
        private int maximumSpeed;
        private String engineType;

        public Builder modelCar(String modelCar){
            this.modelCar = modelCar;
            return this;
        }
        public Builder brandCar (String brandCar){
            this.brandCar = brandCar;
            return this;
        }
        public Builder numberOfWheels (int numberOfWheels){
            this.numberOfWheels = numberOfWheels;
            return this;
        }
        public Builder maximumSpeed (int maximumSpeed){
            this.maximumSpeed = maximumSpeed;
            return this;
        }
        public Builder engineType (String engineType){
            this.engineType = engineType;
            return this;
        }
        public Car build(){
            return new Car(this);
        }
    }
}

